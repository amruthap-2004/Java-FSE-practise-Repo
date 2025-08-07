


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.008


Table CUSTOMERS created.

Elapsed: 00:00:00.018


Table LOANS created.

Elapsed: 00:00:00.013


1 row inserted.

Elapsed: 00:00:00.016


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.014


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


Commit complete.

Elapsed: 00:00:00.002

Customer: John Smith (Age: 65) - Old Rate: .08 - New Rate: .07
Customer: Robert Davis (Age: 72) - Old Rate: .07 - New Rate: .06
Customer: Lisa Anderson (Age: 68) - Old Rate: .075 - New Rate: .065
Discount application completed for customers above 60 years old.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.088
INFO                                                         
------------------------------------------------------------ 
RESULTS AFTER SCENARIO 1 - Updated Loan Rates for Seniors:   

Elapsed: 00:00:00.002
1 rows selected. 

CUSTOMER_NAME   AGE LOAN_ID INTEREST_RATE 
--------------- --- ------- ------------- 
John Smith      65  101     0.07          
Robert Davis    72  103     0.06          
Lisa Anderson   68  106     0.065         

Elapsed: 00:00:00.009
3 rows selected. 

SCENARIO                                                                 
------------------------------------------------------------------------ 
SCENARIO 2: Setting VIP status for customers with balance over $10,000   

Elapsed: 00:00:00.002
1 rows selected. 


Customer: John Smith - Balance: $15000 - VIP Status: TRUE
Customer: Robert Davis - Balance: $25000 - VIP Status: TRUE
Customer: Sarah Wilson - Balance: $12000 - VIP Status: TRUE
Customer: Lisa Anderson - Balance: $18000 - VIP Status: TRUE
VIP status update completed for customers with balance over $10,000.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.010
INFO                                                    
------------------------------------------------------- 
RESULTS AFTER SCENARIO 2 - Customers with VIP Status:   

Elapsed: 00:00:00.002
1 rows selected. 

CUSTOMER_ID CUSTOMER_NAME   BALANCE VIP_STATUS 
----------- --------------- ------- ---------- 
1           John Smith      15000   TRUE       
3           Robert Davis    25000   TRUE       
4           Sarah Wilson    12000   TRUE       
6           Lisa Anderson   18000   TRUE       

Elapsed: 00:00:00.005
4 rows selected. 

SCENARIO                                                         
---------------------------------------------------------------- 
SCENARIO 3: Generating reminders for loans due in next 30 days   

Elapsed: 00:00:00.001
1 rows selected. 


REMINDER #1: Customer John Smith (ID: 1) has a loan payment due in 15 days. Loan ID: 101, Amount: $50000, Due Date: 14-JUL-2025
REMINDER #2: Customer Robert Davis (ID: 3) has a loan payment due in 10 days. Loan ID: 103, Amount: $75000, Due Date: 09-JUL-2025
REMINDER #3: Customer Michael Brown (ID: 5) has a loan payment due in 25 days. Loan ID: 105, Amount: $25000, Due Date: 24-JUL-2025
REMINDER #4: Customer Lisa Anderson (ID: 6) has a loan payment due in 5 days. Loan ID: 106, Amount: $60000, Due Date: 04-JUL-2025
Total reminders generated: 4 loans.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.010
INFO                                                    
------------------------------------------------------- 
RESULTS AFTER SCENARIO 3 - Loans Due in Next 30 Days:   

Elapsed: 00:00:00.002
1 rows selected. 

LOAN_ID CUSTOMER_NAME   LOAN_AMOUNT DUE_DATE                  DAYS_REMAINING 
------- --------------- ----------- ------------------------- -------------- 
106     Lisa Anderson   60000       07/04/2025, 02:49:28 PM   5              
103     Robert Davis    75000       07/09/2025, 02:49:28 PM   10             
101     John Smith      50000       07/14/2025, 02:49:28 PM   15             
105     Michael Brown   25000       07/24/2025, 02:49:28 PM   25             

Elapsed: 00:00:00.007
4 rows selected. 

SUMMARY                                                 
------------------------------------------------------- 
FINAL SUMMARY - All Scenarios Completed Successfully!   

Elapsed: 00:00:00.001
1 rows selected. 

INFO                  
--------------------- 
Summary of Changes:   

Elapsed: 00:00:00.001
1 rows selected. 

CHANGE_SUMMARY                                                
------------------------------------------------------------- 
1. Discount applied to 3 loans for customers above 60         
2. VIP status granted to 4 customers with balance > $10,000   
3. Reminders generated for 4 loans due in next 30 days        

Elapsed: 00:00:00.007
3 rows selected. 



PL/SQL procedure successfully completed.

Elapsed: 00:00:00.047


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.033


Table CUSTOMERS created.

Elapsed: 00:00:00.014


Table LOANS created.

Elapsed: 00:00:00.012


1 row inserted.

Elapsed: 00:00:00.012


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.011


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.002


1 row inserted.

Elapsed: 00:00:00.001


1 row inserted.

Elapsed: 00:00:00.001


Commit complete.

Elapsed: 00:00:00.002
SCENARIO                                                                         
-------------------------------------------------------------------------------- 
SCENARIO 1: Applying 1% discount to loan interest rates for customers above 60   

Elapsed: 00:00:00.003
1 rows selected. 


Customer: John Smith (Age: 65) - Old Rate: .08 - New Rate: .0792
Customer: Robert Davis (Age: 72) - Old Rate: .07 - New Rate: .0693
Customer: Lisa Anderson (Age: 68) - Old Rate: .075 - New Rate: .0743
✅ Discount application completed for customers above 60.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.093
INFO                                                         
------------------------------------------------------------ 
RESULTS AFTER SCENARIO 1 - Updated Loan Rates for Seniors:   

Elapsed: 00:00:00.002
1 rows selected. 

CUSTOMER_NAME   AGE LOAN_ID INTEREST_RATE 
--------------- --- ------- ------------- 
John Smith      65  101     0.0792        
Robert Davis    72  103     0.0693        
Lisa Anderson   68  106     0.0743        

Elapsed: 00:00:00.007
3 rows selected. 

SCENARIO                                                                 
------------------------------------------------------------------------ 
SCENARIO 2: Setting VIP status for customers with balance over $10,000   

Elapsed: 00:00:00.001
1 rows selected. 


Customer: John Smith - Balance: $15000 → VIP Status: ✅ TRUE
Customer: Robert Davis - Balance: $25000 → VIP Status: ✅ TRUE
Customer: Sarah Wilson - Balance: $12000 → VIP Status: ✅ TRUE
Customer: Lisa Anderson - Balance: $18000 → VIP Status: ✅ TRUE
✅ VIP status update completed for customers with balance over $10,000.


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.009
INFO                                                    
------------------------------------------------------- 
RESULTS AFTER SCENARIO 2 - Customers with VIP Status:   

Elapsed: 00:00:00.001
1 rows selected. 

CUSTOMER_ID CUSTOMER_NAME   BALANCE VIP_STATUS 
----------- --------------- ------- ---------- 
1           John Smith      15000   TRUE       
3           Robert Davis    25000   TRUE       
4           Sarah Wilson    12000   TRUE       
6           Lisa Anderson   18000   TRUE       

Elapsed: 00:00:00.004
4 rows selected. 

SCENARIO                                                         
---------------------------------------------------------------- 
SCENARIO 3: Generating reminders for loans due in next 30 days   

Elapsed: 00:00:00.002
1 rows selected. 


🔔 Reminder #1: Customer John Smith (ID: 1) has a loan of $50000 due in 15 days → Due Date: 14-JUL-2025
🔔 Reminder #2: Customer Robert Davis (ID: 3) has a loan of $75000 due in 10 days → Due Date: 09-JUL-2025
🔔 Reminder #3: Customer Michael Brown (ID: 5) has a loan of $25000 due in 25 days → Due Date: 24-JUL-2025
🔔 Reminder #4: Customer Lisa Anderson (ID: 6) has a loan of $60000 due in 5 days → Due Date: 04-JUL-2025
✅ Total reminders generated: 4


PL/SQL procedure successfully completed.

Elapsed: 00:00:00.010
INFO                                                    
------------------------------------------------------- 
RESULTS AFTER SCENARIO 3 - Loans Due in Next 30 Days:   

Elapsed: 00:00:00.002
1 rows selected. 

LOAN_ID CUSTOMER_NAME   LOAN_AMOUNT DUE_DATE                  DAYS_REMAINING 
------- --------------- ----------- ------------------------- -------------- 
106     Lisa Anderson   60000       07/04/2025, 02:54:52 PM   5              
103     Robert Davis    75000       07/09/2025, 02:54:52 PM   10             
101     John Smith      50000       07/14/2025, 02:54:52 PM   15             
105     Michael Brown   25000       07/24/2025, 02:54:52 PM   25             

Elapsed: 00:00:00.007
4 rows selected. 

SUMMARY                                                 
------------------------------------------------------- 
FINAL SUMMARY - All Scenarios Completed Successfully!   

Elapsed: 00:00:00.001
1 rows selected. 

INFO                  
--------------------- 
Summary of Changes:   

Elapsed: 00:00:00.001
1 rows selected. 

CHANGE_SUMMARY                                                
------------------------------------------------------------- 
1. Discount applied to 3 loans for customers above 60         
2. VIP status granted to 4 customers with balance > $10,000   
3. Reminders generated for 4 loans due in next 30 days        

Elapsed: 00:00:00.008
3 rows selected. 

