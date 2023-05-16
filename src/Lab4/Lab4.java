/*
 * @(#) Lab4.java
 *
 * Copyright (c) 2023 Artem Saveliev. All Rights Reserved.
 */
package Lab4;
import java.util.Arrays;
import java.util.Comparator;

/*
 * Is used to create 5 objects of class PEInventory and to sort them in ascending and descending order.
 *
 * @version     1.0 16 Mar 2023
 * @author  	Artem Saveliev
 */
public class Lab4 {
    public static void main(){
        PEInventory pei1 = new PEInventory("М'яч", "Футбол", false, 3, 30.65);
        PEInventory pei2 = new PEInventory("М'яч", "Волейбол", false, 2, 36.85);
        PEInventory pei3 = new PEInventory("Гиря", "Тренування", true, 8, 59.99);
        PEInventory pei4 = new PEInventory("Ракетка", "Бадмінтон", false, 5, 38.99);
        PEInventory pei5 = new PEInventory("Воланчик", "Бадмінтон", false, 4, 14.99);
        PEInventory[] peiArray = {pei1, pei2, pei3, pei4, pei5};

        System.out.print("\nІнвентар:");
        for (int i = 0; i < peiArray.length; i++){
            System.out.print(" "+peiArray[i].objectType+" ("+peiArray[i].sportName+");");
        }

        System.out.println("\n\nПерелік від найдорожчого до найдешевшого:");
        Arrays.sort(peiArray, Comparator.comparingDouble(PEInventory :: getPrice).reversed());
        for (int i = 0; i < peiArray.length; i++){
            System.out.println(peiArray[i].objectType+" ("+peiArray[i].sportName+"): "+peiArray[i].price+";");
        }

        System.out.println("\nПерелік від найменшої кількості предметів, до найбільшої:");
        Arrays.sort(peiArray, Comparator.comparingInt(PEInventory :: getNumber));
        for (int i = 0; i < peiArray.length; i++){
            System.out.println(peiArray[i].objectType+" ("+peiArray[i].sportName+"): "+peiArray[i].number+";");
        }
    }
}