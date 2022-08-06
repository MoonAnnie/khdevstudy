-- DDL(ALTER, DROP)

/*
    <DDL(Data Definition Language)>
        ������ ���� ���� ����Ŭ���� �����ϴ� ��ü�� �����(CREATE), �����ϰ�(ALTER), �����ϴ�(DROP) ��
        ���� ������ ���� �ƴ� �������� ���� ��ü�� �����ϴ� ���� DB ������, �����ڰ� �ַ� ����Ѵ�.

    <ALTER>
        ����Ŭ���� �����ϴ� ��ü�� �����ϴ� �����̴�.
    
    <���̺� ����>
        [ǥ����]
            ALTER TABLE ���̺�� ������ ����;
            
        * ������ ����
            1) Į�� �߰�/����/����
            2) ���� ���� �߰�/���� --> ������ �Ұ���(������ �� ���� �߰��ؾ� �Ѵ�.)
            3) ���̺��/ Į���� / �������Ǹ� ����
*/

-- 1) Į�� �߰�/����/����
-- 1-1) Į�� �߰�(ADD) : ALTER TALBE ���̺�� ADD Į���� ������Ÿ��
--  1-2) Į�� ����(MODIFY)
--   ������ Ÿ�� ���� : ALTER TABLE ���̺�� MODIFY Į���� ������ ������Ÿ��;
--   1-3) Į�� ���� (DROP COLUMN) : ALTER TABLE ���̺�� DROP COLUMN Į����;
--     ������ ���� ��ϵǾ� �־ ���� �����ȴ�. (��, ������ Į�� ������ �Ұ���)
--     ���̺��� �ּ� �� ���� Į���� �����ؾ� �Ѵ�.
--     �����ǰ� �ִ� Į���� �ִٸ� ������ �Ұ����ϴ�.

-- 2) �������� �߰�/����
--  2-1) �������� �߰�
--      PRIMARY KEY : ALTER TABLE ���̺�� ADD [CONSTRAINT �������Ǹ�] PRIMARY KEY(Į����);
--      FOREIGN KEY : ALTER TABLE ���̺�� ADD [CONSTRAINT �������Ǹ�] FOREIGN KEY(Į����) REFERENCES ���̺�� [(Į����)];
--      UNIQUE      : ALTER TABLE ���̺�� ADD [CONSTRAINT �������Ǹ�] UNIQUE(Į����);
--      CHECK       : ALTER TABLE ���̺�� ADD [CONSTRAINT �������Ǹ�] CHECK(Į���� ���� ����);
--      NOT NULL    : ALTER TABLE ���̺�� MODIFY Į���� [CONSTRAINT �������Ǹ�] NOT NULL;

--   2-2) �������� ����
--      NOT NULL : ALTER TABLE ���̺�� MODIFY Į���� NULL;
--      ������    : ALTER TABLE ���̺�� DROP CONSTRAINT �������Ǹ�;

-- 3) ���̺��/Į����/�������Ǹ� ����
--  3-1) Į���� ���� : ALTER TABLE ���̺�� RENAME COLUMN ���� Į���� TO ������ Į����;
--  3-2) �������Ǹ� ���� : ALTER TABLE ���̺�� RENAME CONSTRAINT ���� �������Ǹ� TO ������ �������Ǹ�;
--  3-3) ���̺�� ����
--     1) ALTER TABLE ���̺�� RENAME TO ������ ���̺��;
--     2) RENAME ���� ���̺�� TO ������ ���̺��;











