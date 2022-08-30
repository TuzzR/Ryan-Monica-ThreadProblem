# Ryan-Monica-ThreadProblem
## Implementing concept of Threads to check concurrency issues.

Here we find methods executing on two different stacks and both are calling getters or setters on single object on the heap.
###### An interesting Problem mentioned in the book **Head First Java** by _Kathy Sierra and Bert Bates_ 

This code shows what can happen when two
threads (Ryan and Monica) share a single object (the bank
account).
The code has two classes, _BankAccount_, and
_MonicaAndRyanJob_. The _MonicaAndRyanJob_ class
implements Runnable, and represents the behavior that Ryan
and Monica both have—**checking the balance and making
withdrawals**. But of course, each thread falls asleep in between
checking the balance and actually making the withdrawal.
The _MonicaAndRyanJob_ class has an instance variable of type
_BankAccount_., that represents their shared account.


