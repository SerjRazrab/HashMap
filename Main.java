
import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        Map<String, String> contact = new HashMap<String,String>();
        Scanner scanner = new Scanner(System.in);
        try {
        //FileReader fr = new FileReader("PhoneBook.txt");
        PrintWriter pw = new PrintWriter(new FileWriter("PhoneBook.txt", true));
        
        
        //Boolean flag = true;
    
        while(true){
            System.out.println("Что вы хотите сделать : ? ");
            String action = scanner.nextLine();
            if(action.equals("1")){
            //Добавление контактa
            System.out.println("Сейчас мы добавляем контакт в БД");
            System.out.println("Введите имя контакта : ");
            String name = scanner.nextLine();
            System.out.println("Введите номер телефона контакта : ");
            String number = scanner.nextLine();
            contact.put(name, number);
            pw.println(contact);
            pw.flush();
            pw.close();
            }
            

            //Блок поиска
            else if (action.equals ("2")){
            System.out.println("Ищем контакт");
            System.out.println("Укажите имя контакта :");
            String search = scanner.nextLine();
            System.out.println(contact.getOrDefault(search,"\nКонтакт не найден"));}
            
            //Блок удаления
            else if (action.equals ("3")){
            System.out.println("Выполняем удаление контакта");
            System.out.println("Укажите имя контакта : ");
            String delete = scanner.nextLine();
            System.out.println(contact.remove(delete)+ "\nКонтакт успешно удален");
            }

            else if (action.equals("4")){
                //flag = false;
                System.out.println("Вы вышли !");
                //break;
            }
            
            System.out.println(contact);
        }
        
    }
    
        catch(IOException e){
            System.out.println("Error " + e);
            
            }
            scanner.close();
        }
    }
    

    

