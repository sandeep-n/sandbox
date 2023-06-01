import json


def get_inventory_handler(event, context):
    return {
        "statusCode": 200,
        "body": json.dumps({'dogs': 200, 'cats': 100}),
    }
