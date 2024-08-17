package Dependency_Injection;

/*
 * CODIGO INYECCIÓN DE DEPENDENCIAS
 * Finalizado el: 16/08/24
 * Desarrollado por: Fernando Sánchez González
 */
public class NotificationSender {
 private final MessageService messageService;

 //En esta especifica parte realizamos la Inyección de dependencias a través del constructor
 public NotificationSender(MessageService messageService) {
     this.messageService = messageService;
 }

 public void sendNotification(String message) {
     messageService.sendMessage(message);
 }
}
