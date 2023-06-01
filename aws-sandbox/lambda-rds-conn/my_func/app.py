import sys
import logging
import psycopg2


db_username = "root"
db_password = "portal-developer"
db_name = "postgres"

#rds settings
rds_host  = 'portal-staging-postgresqlv2-two.c3mpeytagnft.us-west-2.rds.amazonaws.com'
name = db_username
password = db_password
db_name = db_name

logger = logging.getLogger()
logger.setLevel(logging.INFO)

try:
    conn = psycopg2.connect(host=rds_host, port=5432, user=name, password=password, dbname=db_name)
except psycopg2.DatabaseError as e:
    logger.error("ERROR: Unexpected error: Could not connect to Postgres instance.")
    logger.error(e)
    sys.exit()

logger.info("SUCCESS: Connection to RDS Aurora/PostgreSQL instance succeeded")


def handler(event, context):
    """
    This function fetches content from Postgres RDS instance
    """

    item_count = 0

    with conn.cursor() as cur:
        cur.execute("CREATE TABLE test (id serial PRIMARY KEY, num integer, data varchar);")
        cur.execute("INSERT INTO test (num, data) VALUES (%s, %s)", 
        (100, "abc'def"))
        cur.execute("INSERT INTO test (num, data) VALUES (%s, %s)", 
        (200, "ghijkl"))
        conn.commit()
        cur.execute("SELECT * FROM test;")
        for row in cur:
            item_count += 1
            logger.info(row)
            #print(row)
    conn.commit()

    return f"Added {item_count} items to RDS Postgres table" 
