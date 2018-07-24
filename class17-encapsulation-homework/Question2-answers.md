
- a) When using proper encapsulation, typically what access modifier should be used for the classes’ members? Why should that access modifier be used? What is the main benefit?

Answer: we should use the "private" access modifier. In this way, we can prevent the data from being modified accidently in a way that we don't want. 

- b) What access modifier should be used for any getters?

Answer: public 

- c) What is an example of an object that intentionally restricts the user from accessing internal data?

Answer: A user object for log-in should prevent other users from accessing the password. A bank account object should restrict users from operating the balance directly. 

  - What would be the consequences if that access wasn’t restricted?

Answer: The user password will be released if not restricted. The bank acount may crash due to the wrong operations such as setting a negative balance.


  - What would the functions be that allow indirect access to that data?

Answer: getters or other public methods that operate the private data, such as getBalance(), depositFunds(), withdrawFunds()


