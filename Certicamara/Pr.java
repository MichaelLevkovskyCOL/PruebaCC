package VehiculoRC;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pr {

	private static Scanner teclado;
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
        String expresion = "^([0-9]+,[N|S|O|E];)*([0-9]+,[N|S|O|E])$";
        String validaNum = "^[1-9][0-9]*$";
        String filas=null, columnas=null,instruccion, direccion;
        int desplazamiento;
        RControl c;
        Pattern patron;
        Matcher match;
        StringTokenizer st;
        while(filas==null){            
            System.out.print("Ingrese # de filas: ");
            filas=teclado.nextLine();        
            patron = Pattern.compile(validaNum);
            match = patron.matcher(filas);                     
        }
        while(columnas==null){
            System.out.print("Ingrese # de columnas: ");
            columnas=teclado.nextLine();        
            patron = Pattern.compile(validaNum);
            match = patron.matcher(columnas);            
        }
        System.out.println("  La superficie es de "+filas+" filas y "+columnas+" columnas.");
        c = new RControl(Integer.parseInt(filas), Integer.parseInt(columnas));
       
            System.out.print("Ingrese instruccion en el formato <desplazamiento>,<direccion> :");
            instruccion = teclado.nextLine();
                patron = Pattern.compile(expresion);
                match = patron.matcher(instruccion);            
                if (match.matches()) {
                    st = new StringTokenizer(instruccion, ",;");
                    while(st.hasMoreTokens()){
                    desplazamiento=Integer.parseInt(st.nextToken());
                    direccion=st.nextToken();
                    c.movimiento(desplazamiento, direccion);
                    }
                }
                else
                    System.out.println("  Error en formato de comando");
            }
        
    }

