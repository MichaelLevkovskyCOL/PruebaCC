package VehiculoRC;

public class Superficie {
	
    private int Area[][];
	private int Rows;
	private int Columns;
    public Superficie(){};

    public Superficie(int fi, int col){
        this.Rows=fi;
        this.Columns=col;
    };

    public void setCarroArea(int posfilas, int poscolumnas, int vehiculo){
        this.Area[posfilas][poscolumnas]=vehiculo;  
    };

    public void setArea(){
        this.Area = new int[this.Rows][this.Columns];
        for(int fil=0; fil<this.Rows; fil++){
            for(int col=0; col<this.Columns; col++){
                this.Area[fil][col]=0;
            }
        }
    };
}
