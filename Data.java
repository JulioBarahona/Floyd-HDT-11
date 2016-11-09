/**
 * Created by Julio on 11/9/2016.
 */
public class Data {
    public Graph datos = new SingleeGraph("Guatemala cities");

    public void generateNode(String city){
        datos.addNode(city);
    }

    public void generateEdge(String city, int distancia){
        datos.addEdge();

    }
}

