package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Digite um número: ");
            System.out.println("1 para inserir: ");
            System.out.println("2 para visualizar: ");
            System.out.println("3 para atualizar: ");
            System.out.println("4 para deletar: ");
            System.out.println("5 para sair: ");
            int i = sc.nextInt();

            switch (i){
                case 1:
                    String name = sc.next();
                    DatabaseOperations.insertData(name);
                    break;
                case 2:
                    DatabaseOperations.readeData();
                    try{
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    int id = sc.nextInt();
                    String newName = sc.next();
                    DatabaseOperations.updateData(id, newName);
                    break;
                case 4:
                    int idd = sc.nextInt();
                    DatabaseOperations.deleteData(idd);
                    break;
                case 5:
                    System.exit(0);
            }
            System.out.println();
        }
    }
}
