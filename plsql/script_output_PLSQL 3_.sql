

PL/SQL procedure successfully completed.

Elapsed: 00:00:00.034


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.029


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.027


Table SAVINGS_ACCOUNTS created.

Elapsed: 00:00:00.011


Table EMPLOYEES created.

Elapsed: 00:00:00.011


Table ACCOUNTS created.

Elapsed: 00:00:00.009


1 row inserted.

Elapsed: 00:00:00.013


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.014


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.012


1 row inserted.

Elapsed: 00:00:00.001


Commit complete.

Elapsed: 00:00:00.002


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.032


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.028


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.028


Table SAVINGS_ACCOUNTS created.

Elapsed: 00:00:00.011


Table EMPLOYEES created.

Elapsed: 00:00:00.010


Table ACCOUNTS created.

Elapsed: 00:00:00.009


1 row inserted.

Elapsed: 00:00:00.013


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.011


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.011


1 row inserted.

Elapsed: 00:00:00.001


Commit complete.

Elapsed: 00:00:00.002


Procedure PROCESSMONTHLYINTEREST compiled

Elapsed: 00:00:00.012

✅ Monthly interest applied to all savings accounts.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.011
ACCOUNT_ID CUSTOMER_ID BALANCE 
---------- ----------- ------- 
1          101         1010    
2          102         5050    
3          103         7575    

Elapsed: 00:00:00.004
3 rows selected. 



Procedure UPDATEEMPLOYEEBONUS compiled

Elapsed: 00:00:00.010

✅ Bonus applied to department 10.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.010
EMP_ID EMP_NAME  SALARY DEPARTMENT_ID 
------ --------- ------ ------------- 
1      Alice     33000  10            
2      Bob       38500  10            
3      Charlie   40000  20            

Elapsed: 00:00:00.007
3 rows selected. 



Procedure TRANSFERFUNDS compiled

Elapsed: 00:00:00.012

✅ Transfer successful: 3000 transferred.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.009
ACCOUNT_ID CUSTOMER_ID BALANCE 
---------- ----------- ------- 
101        201         7000    
102        202         5000    

Elapsed: 00:00:00.005
2 rows selected. 


BEGIN
*
ERROR at line 1:
ORA-20001: ❌ Insufficient balance in source account.
ORA-06512: at "SQL_EIVESP879JJPXUAFUIPEMP7GYN.TRANSFERFUNDS", line 27
ORA-06512: at line 2

https://docs.oracle.com/error-help/db/ora-20001/


More Details :
https://docs.oracle.com/error-help/db/ora-20001/
https://docs.oracle.com/error-help/db/ora-06512/
Elapsed: 00:00:00.007
STATUS                                    
----------------------------------------- 
✅ All procedures executed successfully.   

Elapsed: 00:00:00.002
1 rows selected. 

