class SMSservice: MessageService() {
    override fun sendMessage(sender: String, receiver: String, message: String){
       if (sender.length == 9 && receiver.length == 9)
           super.sendMessage(sender, receiver, message)
    }



}