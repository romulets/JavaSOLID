# Single Responsability Principle (SRP)

> A class should have one, and only one, reason to change.

Maybe the most important principle of the 5, It tells you that one thing should do just one thing.

Split your code in little classes and methods with only one responsability. Yes it means more classes, but it also means that your code's maintainability is better. 

Think about the [given problem] (problem/Client.java). It isn't an anemic model ([Martin Fowler says hi](http://www.martinfowler.com/bliki/AnemicDomainModel.html)) and it makes what we want. But this class has to much responsability isn't it?

This code knows the logic of:
* Validate E-mail
* Validate Document
* Save client in file

When we decide to change the code to save in database, it'll grow a little uh? And if we add another attributes to the model that need validation too? And what about really validate e-mails and documents?

Well, thinking better, maybe split our code can be a good thing... 

[Look the solution I propose.] (solution/)

You probably will find something that you could've done better, and yes you could. That's the spirit. 

But look how better is it! If we decide to change the persistence logic, it is separeted! The validations too! If we want to send an e-mail warning the register,  add another class and then two lines to our `services.ClientService.java`!

And note that the `models.Client.java` continues to be a rich model. It knows if is valid or not.

It is just an example to help understand the principle. I know you thought that with frameworks like Spring and Hibernate everything would be easier. But well, everyone starts from some place uh? Try apply it in your big application and you'll se how this principle helps!

[Thank you so much Tom DeMarco and Meilir Page-Jones!] (https://drive.google.com/file/d/0ByOwmqah_nuGNHEtcU5OekdDMkk/view)

