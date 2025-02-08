import java.util.ArrayList;
import java.util.Iterator;

public class Back {
    public static final int M = 17;
    private ArrayList<Time>[] table;

    @SuppressWarnings("unchecked")
    public Back() {
        table = (ArrayList<Time>[])new ArrayList[M];
    }

    private int hash(String id) {
        int h = 0;

        for(int i = 0; i < id.length(); ++i)
            h = (31 * h  + id.charAt(i)) % M;
        
        return h;
    }

    public Time get(String id) {
        int h = hash(id);
        ArrayList<Time> times = table[h];
        
        if(times == null)
            return null;
        for(Time time : times)
            if((time.codigo).equals(id))
                return time;
        return null;
    }

    public void put(Time t) {
        int h = hash(t.codigo);
        ArrayList<Time> times = table[h];
        if(times == null) {
            times = new ArrayList<Time>();
            times.add(t);
            table[h] = times;
        } else {
            boolean achei = false;
            for(Time time : times)
                if(time.codigo.equals(t.codigo))
                    achei = true;
            if(!achei)
                times.add(t);
        }
    }

    public void status(){
        for (int i = 0; i < M; ++i){
            if (table[i] != null){
                ArrayList<Time> liv = table[i];
                System.out.printf("A posição %d possui %d times\n",i,liv.size());
            } else
                System.out.printf("A posição %d não possui times cadastrados\n",i);
        }
    }
}
