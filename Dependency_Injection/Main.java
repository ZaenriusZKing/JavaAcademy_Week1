package Dependency_Injection;

/*
 * CODIGO INYECCIÓN DE DEPENDENCIAS
 * Finalizado el: 16/08/24
 * Desarrollado por: Fernando Sánchez González
 */
public class Main {
 public static void main(String[] args) {
     // Crear la implementación concreta de MessageService
	 /*
	  * Por cierto, si deseas cambiar que el mensaje en vez de que sea por un Email sea por SMS
	  * Tan solo cambia el codigo que esta justo aqui abajo el new EmailService, cambialo a
	  * SMSService. :)
	  */
     MessageService messageService = new EmailService();
     
     //Aqui Inyectamos la dependencia usando el constructor
     NotificationSender notificationSender = new NotificationSender(messageService);
     
     //Aqui usamos la clase con la dependencia inyectada
     notificationSender.sendNotification("Hola Mundo! El Mensaje fue enviado correctamente!");
 }
}

