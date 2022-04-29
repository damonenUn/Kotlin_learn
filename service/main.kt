fun main (){
    val emailService = EmailService ()
    val smSservice = SMSservice()


    emailService.sendMessage("Ostap@", "Oleksa@", "Hi!")
    smSservice.sendMessage("123456789", "123456789", "Hi!")

//    messageService.sendMessage("Ostap@", "Oleksa@", "Hi!")
//    messageService.sendMessage(123456789, 123456789, "SMS")
}