package Dependency_Injection;

/*
 * CODIGO INYECCIÓN DE DEPENDENCIAS
 * Finalizado el: 16/08/24
 * Desarrollado por: Fernando Sánchez González
 */
public class SMSService implements MessageService {
 @Override
 public void sendMessage(String message) {
     System.out.println("Enviando mensaje por SMS: " + message);
 }
}
