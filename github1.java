Question:-
There is an automatic vending machine that decides what items it will give out for the money inserted into it.

The vending and machine has 2 kinds of items - Snacks Drinks. The rate card is below

SNACKS        | Price | Drinks        | Price
--------------------------------------------------------
Potato Chips  |  10   | Coke          |  7 
Cracker       |  12   | Lemonade      |  10 
PopCorn       |  5    | Orange Juice  |  11
Cashew        |  15   | Milkshake     |  15


The machine operates with the following rules,

1.If money is enough to buy onlu 1 item, the preferance of items to be given out follows
this order Drink > Snack such that the order price is maximum.

2.If money is enough to buy two items, the machine gives out two items such that the order price is maximun.
For example, if you insert Rs.19, it will give out Coke & Cracker instead of PopCorn + Lemonade + Rs.4 balance

3. If two combinations of Snacks & Drink items are of the same price, the machine gives out the combination
where the drink cost is highest.

4.The machine can only give out 1 item of each kind. 2 drinks or 3 snacks is not possible.

5. In each of the above cases, the remaining money is returned

6. If money is not enough to buy anything, the money is returned.


Input  |  Output
-----------------------------
10     |  Lemonade
25     |  Milkshake & Potato Chips
9      |  Coke & Rs.2.00
1      |  Rs. 1.00


__________________________________________________________________________________________________________________________________

__________________________________________________________________________________________________________________________________

__________________________________________________________________________________________________________________________________

__________________________________________________________________________________________________________________________________


Solution:  (Code is written in java)

import java.util.*;
public class cog_code
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int bal=0,price=0,bal1=0,price2=0;
        String item="",item2="";
        String snacks[]={"PopCorn","PotatoChips","Cracker","Cashew"};
        int sprice[]={5,10,12,15};
        String drink[]={"coke","Lemonade","Orange juice","Milkshake"};
        int dprice[]={7,10,11,15};

        System.out.println("Enter price");
        int input=in.nextInt();
        if(input>=5 && input<=15)
        {
            for(int i=0;i<4;i++)
            {
                for(int j=1;j<=input;j++)
                {
                    if(j==dprice[i])
                    {
                        item=drink[i];
                        price=j;
                    }
                    else if(j==sprice[i] && input!=10)
                    {
                        item=snacks[i];
                        price=j;
                    }

                }
            }
            if(price==input)
                System.out.println(item);

            else
            {
                bal=input-price;
                System.out.println(item+"+"+"Rs"+"."+bal);
            }
        }
            else if(input>15)
            {
                for(int i=0;i<4;i++)
                {
                    for(int j=1;j<=input;j++)
                    {
                        if(j==dprice[i])
                        {
                            item=drink[i];
                            price=j;
                            break;
                        }

                    }
                }
                bal=input-price;
                for(int k=0;k<4;k++)
                {
                    for(int l=1;l<=bal;l++)
                    {
                        if(l==sprice[k])
                        {
                            item2=snacks[k];
                            price2=l;
                            break;
                        }

                    }
                }

                bal1=bal-price2;
                if(bal1==0)
                    System.out.println(item+"&"+item2);
                else
                    System.out.println(item+"&"+item2+"+ Rs."+bal1);
            } 
            else
            {
                System.out.println("Rs."+input);
            }
        }
    }



