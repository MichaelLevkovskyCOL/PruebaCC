package VehiculoRC;

public class RControl {
	private int filas, columnas,posFila=0,  posColumna=0;
    private VehiculoRC.Superficie Superficie;
    
    public RControl(int f, int c){
        this.filas=f;
        this.columnas=c;
        Superficie=new Superficie(this.filas, this.columnas); 
        Superficie.setArea(); 
        Superficie.setCarroArea(0, 0, 1);
            
    };
    
    private void Norte(int delta){
        int limite=this.posFila+delta; 
        for(int c=this.posFila; c<limite; c++){
            Superficie.setCarroArea(c, this.posColumna, 0);
            Superficie.setCarroArea(c+1, this.posColumna, 1);
            }
            this.posFila=limite;
    }
    
    private void Sur(int delta){
        int limite=this.posFila-delta;
        for(int c=this.posFila; c>limite; c--){
            Superficie.setCarroArea(c, this.posColumna, 0);
            Superficie.setCarroArea(c-1, this.posColumna, 1);
        }
        this.posFila=limite;
        
    }
    
    private void Este(int delta){
        int limite=this.posColumna+delta;
        for(int c=this.posColumna; c<limite; c++){
            Superficie.setCarroArea(this.posFila, c, 0);
            Superficie.setCarroArea(this.posFila, c+1, 1);
        }
        this.posColumna=limite;
        
    }
    
    private void Oeste(int delta){
        int limite=this.posColumna-delta;
        for(int c=this.posColumna; c>limite; c--){
            Superficie.setCarroArea(this.posFila, c, 0);
            Superficie.setCarroArea(this.posFila, c-1, 1);
        }
        this.posColumna=limite;        
    }
    public void movimiento(int delta, String direccion){
        System.out.println("Comando: "+delta+","+direccion);
        switch (direccion){
            case "N":
                Norte(delta);
                break;
            case "S":
                Sur(delta);
                break;
            case "E":
                Este(delta);
                break;
            case "O":
                Oeste(delta);
                break;
        }
        System.out.println("  Nueva Posición: ("+this.posFila+","+this.posColumna+")");
    }    
}
