public class BackEnd {
    private int tam1 = 0;
    private int tam2 = 0;
    private Player p1 = new Player(0, 0);
    private Player p2 = new Player(0, 0);
    private Pilha controlP1 = new Pilha();
    private Pilha controlP2 = new Pilha();

    public int push(int player) {
        int carta = generator();
        Pilha p = new Pilha(carta, null);
        if(player == 1) {
            if(tam1 != 0)
                p.proximo = controlP1.proximo;

            controlP1.proximo = p;

            tam1++;
            p1.pontuacao += carta;
        } else {
            if(tam2 != 0)
                p.proximo = controlP2.proximo;

            controlP2.proximo = p;

            tam2++;
            p2.pontuacao += carta;
        }
        return carta;
    }

    public void penalidade(int player) {
        if(player == 1) {
            p1.penalidade += 5;
        } else {
            p2.penalidade += 5;
        }
    }

    public int getScore(int player) {
        if(player == 1)
            return p1.pontuacao - p1.penalidade;
        else
            return p2.pontuacao - p2.penalidade;
    }

    public int pop(int player) throws Exception {
        if(player == 1) {
            if(isEmpty(tam1))
                throw new Exception("Empty");
            else {
                Pilha tmp = controlP1.proximo;
                controlP1.proximo = controlP1.proximo.proximo;

                p1.pontuacao -= tmp.carta;

                tam1--;
                return tmp.carta;
            }
        } else {
            if(isEmpty(tam2))
                throw new Exception("Empty");
            else {
                Pilha tmp = controlP2.proximo;
                controlP2.proximo = controlP2.proximo.proximo;

                p2.pontuacao -= tmp.carta;

                tam2--;
                return tmp.carta;
            }
        }
    }

    public int[] print(int winner) {
        if(winner == 1) {
            int array[] = new int[tam1];
            int op = 0;
            Pilha el = controlP1.proximo;

            while (el != null) {
                array[op++] = el.carta;
                el = el.proximo;
            }

            return array;

        } else {
            int array[] = new int[tam2];
            int op = 0;
            Pilha el = controlP2.proximo;

            while(el.proximo != null) {
                array[op++] = el.carta;
                el = el.proximo;
            }

            return array;
        }
    }

    public int winner() {
        if(getScore(1) > getScore(2))
            return 1;
        else if(getScore(2) > getScore(1))
            return 2;
        else
            return 3;
    }

    public boolean isEmpty(int tam) {
        return tam == 0;
    }

    public int generator() {
        return (int) (Math.random() * 10) + 1;
    }
}
