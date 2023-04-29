# Banking-system-using-web-services
This web service is built using java language.  functionalities are Display balance of bank accounts, Transfer money, Withdraw money, Deposit money, Add new users and Authenticate new users.

open the main.java file in one console and demoWS.java in another console

enter the location of wsimport.exe in the terminal and run the README.md file

you will see a notification called "Bank Server Starts" 

![1](https://user-images.githubusercontent.com/73056402/235314386-fd20f6af-8682-4c6f-bde1-0e66a04fb4a7.png)

here are the six operations of my web banking service 
1. Display balance - The user may view the balance at any time during this process.
2. Transfer - During this process, the customer can transfer money and receive updates on their account's balance.
3. Withdraw - During this process, the user can withdraw money and receive updates on the balance.
4. Deposit - During this process, users can add funds and receive updates on their balance.
5. Add user. I've made a hash map to store the user's information. Therefore, user information will be stored in the order throughout this transaction.
6. Auth user - by using this function, you may prevent bogus and unneeded user accounts from logging in.

After making changes in server side package we have to run the demoWs.Java class then we can generate the stub folder via the intelij terminal below,

![2](https://user-images.githubusercontent.com/73056402/235314445-11a828d2-1457-483f-a185-5eac621bde23.png)

Above message shows bank server created successfully
Users can enter their account number and login
![3](https://user-images.githubusercontent.com/73056402/235314467-b8ff96a2-3979-4e0c-be7c-95279938b8dc.png)

Like the below image users can deposit cash to their accounts. And you can see the updated balance
![4](https://user-images.githubusercontent.com/73056402/235314500-d2a312b2-109f-43af-88c2-f5b7c515c1d8.png)

Users can withdraw money as I shown in the below image. Account balance is also updated.
![5](https://user-images.githubusercontent.com/73056402/235314513-7a6cdae7-0ec0-4479-9df8-0804c298625d.png)

User money transfer from account to account
![6](https://user-images.githubusercontent.com/73056402/235314532-b01bdd6c-4b6a-4d5e-96d5-712631efeb16.png)

Also users can exit from terminal by pressing d
![7](https://user-images.githubusercontent.com/73056402/235314549-fc4ad131-a0ba-4e53-bcba-aff77661c58c.png)

Also, if users try to transfer or withdraw amount more than their balance, below message will be seen
![8](https://user-images.githubusercontent.com/73056402/235314576-b4c67e47-a142-4830-b04d-eabe7250a51b.png)


