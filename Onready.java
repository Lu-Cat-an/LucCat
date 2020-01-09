package onready2.pkg0;

/**
 *
 * @author Sangretsu
 */
public class Onready20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        auto arrayAuto[] =new auto [2];
        moto arrayMoto[] =new moto [2];
        
         arrayAuto[0] = new auto("4");
         arrayAuto[0].setDatosGenerales("Peugeot","206",200000);
         arrayAuto[0].mostrarDatos();
         
         arrayMoto[0] = new moto("125");
         arrayMoto[0].setDatosGenerales("Honda","Titan",60000);
         arrayMoto[0].mostrarDatos();
         
         arrayAuto[1] = new auto("5");
         arrayAuto[1].setDatosGenerales("Peugeot","208",250000);
         arrayAuto[1].mostrarDatos();
         
         arrayMoto[1] = new moto("160");
         arrayMoto[1].setDatosGenerales("Yamaha","YBR",80500.50);
         arrayMoto[1].mostrarDatos();
         
         System.out.println("=============================");
         
         Metodos mayorPrecio = new Metodos();
         mayorPrecio.compararPrecioMayor(arrayAuto ,arrayMoto);
         
         Metodos.compararPrecioMenor(arrayAuto, arrayMoto);
         Metodos.compararModelo(arrayAuto, arrayMoto);
         Metodos.mayorAMenor(arrayAuto, arrayMoto);
            
         
    }
    
}
package onready2.pkg0;

public class Metodos {
    public void compararPrecioMayor(auto[] arrayAuto , moto[] arrayMoto){
        int mayorPrecioAuto = 0;
            
            //comparar precio auto mayor
            for (int i=0;i<arrayAuto.length;i++){
                if(arrayAuto[0].precio>=arrayAuto[i].precio)
                    mayorPrecioAuto = 0;
                else
                    mayorPrecioAuto = i;           
            }
            int mayorPrecioMoto = 0;
            for (int i=0;i<arrayMoto.length;i++){
                if(arrayMoto[0].precio>arrayMoto[i].precio)
                    mayorPrecioMoto = 0;
                else
                    mayorPrecioMoto = i;
            }
            
            if(arrayAuto[mayorPrecioAuto].precio > arrayMoto[mayorPrecioMoto].precio){
                System.out.println("Vehículo más caro: "+arrayAuto[mayorPrecioAuto].marca+" "+arrayAuto[mayorPrecioAuto].modelo);   
            }
            else{
                System.out.println("Vehículo más caro: "+arrayMoto[mayorPrecioMoto].marca+" "+arrayMoto[mayorPrecioMoto].modelo);
            }
    }
    
    public static void compararPrecioMenor(auto[] arrayAuto , moto[] arrayMoto){
        int mayorPrecioAuto = 0;
            
            //comparar precio auto menor
            for (int i=0;i<arrayAuto.length;i++){
                if(arrayAuto[0].precio>=arrayAuto[i].precio)
                    mayorPrecioAuto = i;
                else
                    mayorPrecioAuto = 0;           
            }
            int mayorPrecioMoto = 0;
            for (int i=0;i<arrayMoto.length;i++){
                if(arrayMoto[0].precio>arrayMoto[i].precio)
                    mayorPrecioMoto = i;
                else
                    mayorPrecioMoto = 0;
            }
            
            if(arrayAuto[mayorPrecioAuto].precio < arrayMoto[mayorPrecioMoto].precio){
                System.out.println("Vehículo más barato: "+arrayAuto[mayorPrecioAuto].marca+" "+arrayAuto[mayorPrecioAuto].modelo);   
            }
            else{
                System.out.println("Vehículo más barato: "+arrayMoto[mayorPrecioMoto].marca+" "+arrayMoto[mayorPrecioMoto].modelo);
            }
    }
    
    public static void compararModelo(auto[] arrayAuto , moto[] arrayMoto){          
            //auto
              int i = 0;
              while (i<arrayAuto.length){
                  
                  String model = arrayAuto[i].modelo;
                  
                  for(int b = 0; b < model.length() ;b++){
                      char letra = model.charAt(b);
                      if(letra == 'Y'){
                          System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ arrayAuto[i].marca+" "+arrayAuto[i].modelo +" "+arrayAuto[i].precio);  
                          break;
                        }              
                }
              i++;    
              }
            //moto
            i = 0;
            while (i<arrayMoto.length){
                
                  String model = arrayMoto[i].modelo;
                  
                  
                  for(int b = 0;b < model.length();b++){
                      
                      char letra = model.charAt(b);
                      if(letra == 'Y'){
                          System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+ arrayMoto[i].marca+" "+arrayMoto[i].modelo +" "+arrayMoto[i].precio); 
                          
                          break;
                      }
                  }
                i++;
            }
    }
    
    public static void mayorAMenor(auto[] arrayAuto , moto[] arrayMoto){
        int mAMAuto[] = new int [2]; 
        int mAMMoto[] = new int [2];
        int vehiculo [] = new int [4];
        String marca [] = new String [4];
        String modelo [] = new String [4];
        double costo [] = new double [4];
        
        int cont = 0;
        //esto pensando en si se agregan mas autos luego
        //comparo los dos primeros autos
        //while(cont < arrayAuto.length){
            if(arrayAuto[cont].precio > arrayAuto[1].precio){
                mAMAuto[1] = cont;               
                mAMAuto[0] = 1;
            }
            else{
                mAMAuto[1] = 1;
                mAMAuto[0] = cont;
   
            }
            cont ++;
        //}        
        cont = 0;
        //el auto 1 es el mas caro
        //reinicio el cont y comparo entre las motos la maxima y minima
        //while(cont < mAMMoto.length){
            if(arrayMoto[cont].precio > arrayMoto[1].precio){
                mAMMoto[1] = cont;
                mAMMoto[0] = 1;    
            }
            else{
                mAMMoto[1] = 1;                
                mAMMoto[0] = cont;     
            }
            cont ++;
       // }
       //la moto 1 es la mas cara
        cont = 1;
        //empieza la comparacion entre el maximo auto y el moto
            if(arrayMoto[mAMMoto[cont]].precio > arrayAuto[mAMAuto[cont]].precio){
                vehiculo[3] = mAMMoto[cont];
                marca[3] = arrayMoto[cont].marca;
                modelo[3] = arrayMoto[cont].modelo;
                
                
                vehiculo[2] = mAMAuto[cont];
                marca[2] = arrayAuto[cont].marca;
                modelo[2] = arrayAuto[cont].modelo;
                costo[2] = arrayAuto[mAMAuto[cont]].precio;
                
                }
                else{
                vehiculo[3] = mAMAuto[cont];
                marca[3] = arrayAuto[cont].marca;
                modelo[3] = arrayAuto[cont].modelo;
                
                vehiculo[2] = mAMMoto[cont];
                marca[2] = arrayMoto[cont].marca;
                modelo[2] = arrayMoto[cont].modelo;
                costo[2] = arrayMoto[mAMMoto[cont]].precio;
                }
            cont = 0;
        //empieza la comparacion entre el minimo auto y el moto
            if(arrayMoto[mAMMoto[cont]].precio  > arrayAuto[mAMAuto[cont]].precio){
                vehiculo[1] = mAMMoto[cont];
                modelo[1] = arrayMoto[cont].modelo;
                marca[1] = arrayMoto[cont].marca;
                costo[1] = arrayMoto[mAMMoto[cont]].precio;
                
                vehiculo[0] = mAMAuto[cont];
                modelo[0] = arrayAuto[cont].modelo;
                marca[0] = arrayAuto[cont].marca;
                
                }
                else{
                vehiculo[1] = mAMAuto[cont];
                marca[1] = arrayAuto[cont].marca;
                modelo[1] = arrayAuto[cont].modelo;
                costo[1] = arrayAuto[mAMAuto[cont]].precio;
                
                vehiculo[0] = mAMMoto[cont];
                marca[0] = arrayMoto[cont].marca;
                modelo[0] = arrayMoto[cont].modelo;
                
                }    
        //empieza la comparacion entre los del medio        
                           
            if(costo[1]>costo[2]){
                System.out.println("Vehículos ordenados por precio de mayor a menor:");
                System.out.println(marca[3]+" "+modelo[3]);
                System.out.println(marca[1]+" "+modelo[1]);
                System.out.println(marca[2]+" "+modelo[2]);
                System.out.println(marca[0]+" "+modelo[0]);
            }else{
                
            
            //esta opcion no deberia aparecer y salta, hay un error
                System.out.println("Vehículos ordenados por precio de mayor a menor:");
                System.out.println(marca[3]+" "+modelo[3]);
                System.out.println(marca[2]+" "+modelo[2]);
                System.out.println(marca[1]+" "+modelo[1]);
                System.out.println(marca[0]+" "+modelo[0]);

                    
                    
        }                    
    }
}

package onready2.pkg0;
class auto extends vehiculos{
            String puertas;
            
            public auto(String pu){
                this.puertas = pu;
            }
                    
            @Override
            void setDatosGenerales(String ma,String mo,double pre){
                this.marca = ma;
                this.modelo = mo;
                this.precio = pre;
            }
            public void mostrarDatos(){
                System.out.println("Marca: "+marca+" // Modelo: "+modelo+" // Puertas: " +puertas +" // Precio: $"+precio);
            }
            
        }
package onready2.pkg0;
class moto extends vehiculos{
            String cilindradas;
            public moto(String cili){
                this.cilindradas = cili;
            }

            @Override
            void setDatosGenerales(String ma, String mo, double pre) {
                this.marca = ma;
                this.modelo = mo;
                this.precio = pre;
            }
            public void mostrarDatos(){
                System.out.println("Marca: "+marca+" // Modelo: "+modelo+" // Cilindrada: " +cilindradas +"c // Precio: $"+precio);
            }
            
        }

package onready2.pkg0;

public interface datosGenerales {         
                void mostrarDatos();
}
package onready2.pkg0;

        abstract class vehiculos implements datosGenerales{

            String marca;
            String modelo;
            double precio;
            abstract void setDatosGenerales(String ma,String mo,double pre);
            public void mostrarDatos(){               
            }
        }
