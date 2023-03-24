
package Login;

public class Seguridad {
    
  String encriptar(String pass){
      
      char array[] = pass.toCharArray();
      
      for(int i = 0; i < array.length; i++){
            array[i] = (char)(array[i] + (char)307);
      }
      
      String encriptado = String.valueOf(array);
      
    return encriptado;         
              
  }
  
   
    
   
}
