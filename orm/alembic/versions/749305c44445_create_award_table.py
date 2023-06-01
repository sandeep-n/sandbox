"""create award table

Revision ID: 749305c44445
Revises: 
Create Date: 2020-12-28 17:08:33.171937

"""
from alembic import op
import sqlalchemy as sa


# revision identifiers, used by Alembic.
revision = '749305c44445'
down_revision = None
branch_labels = None
depends_on = None


def upgrade():
    op.create_table(
        'award', 
        sa.Column('id', sa.Integer, primary_key=True), 
        sa.Column('name', sa.String(50), nullable=False), 
        sa.Column('recipient', sa.String(100), nullable=False), 
        sa.Column('date', sa.Date, nullable=False)
    )


def downgrade():
    op.drop_table('award')
