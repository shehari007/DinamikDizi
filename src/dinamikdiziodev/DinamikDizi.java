/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinamikdiziodev;



/**
 *
 * @author sheharyar
 */
import java.util.Arrays;

public class DinamikDizi {
    private int dizi[];    
    private int boyut;
    private int kapasite;
    
    public DinamikDizi(){
        dizi = new int[5];
        boyut=0;
        kapasite=5;
    }
     
    public void addElement(int element){
        if (boyut == kapasite){ 
        }
        dizi[boyut] = element;
        boyut++;
    }
            public void addElement(int index, int element){
        if (boyut == kapasite){
        }
        dizi[index] = element;
        boyut++;
    }
            // to remove an element at a particular index
    public void sil(int index){
        if(index>=boyut || index<0){
            System.out.println("Bu indexe Bir Eleman yok");
        }else{
            for(int i=index;i<boyut-1;i++){
                dizi[i] = dizi[i+1];
            }
            dizi[boyut-1]=0;
            boyut--;
        }}
        
        public int Boy(){
        return boyut;
    }
     
    
    public int Kapa(){
        return kapasite;
    }
     
    
    public void printElements(){
        System.out.println("Dizinin elemanlar :"+Arrays.toString(dizi));
          }
     public static void main(String args[]){
       DinamikDizi dizi = new DinamikDizi();
       dizi.printElements();
       
      //boş dizinin veri ekle metodu ile veri eklendi  
        dizi.addElement(1);
        dizi.addElement(2);
        
        System.out.println("Dizi Boyut :"+dizi.Boy()+
            " Ve Dizi Kapasite :"+dizi.Kapa());
        dizi.printElements();
        
        dizi.addElement(3);
        System.out.println("Dizi Boyut :"+dizi.Boy()+
            " Ve Kapasite :"+dizi.Kapa());
        dizi.printElements();
        
        //Dizinin index ile eleman eklendi
        dizi.addElement(1,5);
        System.out.println("Dizi Boyut :"+dizi.Boy()+
            " Ve Kapasite :"+dizi.Kapa());        
        dizi.printElements();
        
        //Dizinin 2. index'de Eleman Sildi
        dizi.sil(2);
        System.out.println("Dizi Boyut :"+dizi.Boy()+
            " Ve Kapasite :"+dizi.Kapa());        
        dizi.printElements();
        
        //5. index boş
         System.out.println("Dizinin 5. index'de Eleman Silecek");
        dizi.sil(5);
         dizi.printElements();
         System.out.println("Dizi Boyut :"+dizi.Boy()+
            " Ve Kapasite :"+dizi.Kapa());
     }
}
        
    
  
        
    
    


