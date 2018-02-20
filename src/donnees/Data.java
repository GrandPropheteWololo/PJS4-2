package donnees;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Data implements IData {
	/**
	 * IData impl�mente Serializable
	 */
	private static final long serialVersionUID = 1L;
	private Object obj;
	private int id;
	private static int NUMERO;
	
//	public Data(Object o){		
//		this.obj = o;
//		this.id = NUMERO;
//		numero();
//	}
	
	
	public int numero(){
		return NUMERO++;
	}
	
	public Object getObj(){
		return this.obj;
	}
		
	// m�thode readObject, utilis�e pour reconstituer un objet s�rializ�
    public  void readObject(ObjectInputStream inStream) throws IOException, ClassNotFoundException {
       // l'ordre de lecture doit �tre le m�me que l'ordre d'�criture d'un objet
       this.obj = inStream.readUTF() ;
       this.id = inStream.readInt() ;
       // le salaire n'est pas relu, vu qu'il n'a pas �t� �crit
   }
    
    public  void writeObject(ObjectOutputStream outStream) throws IOException {
    	// �criture de toute ou partie des champs d'un objet
    	outStream.writeUTF((String) obj) ;
    	outStream.writeInt(id) ;
    	// on choisit de ne pas �crire le salaire, qui ne fait
    	// pas partie de l'�tat d'une instance de marin
   }


	public int getId() {
		return id;
	}

	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object retrieve() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(File f) throws IOException {
		// TODO Auto-generated method stub
		
	}	
    
}
