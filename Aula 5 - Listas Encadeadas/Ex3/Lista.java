public class Lista {
    private No controle;
    private int tamanho = 0;

    public Lista() {
        controle = new No(null, null, null);
    }

    public void add(Veiculo v) throws Exception {
        No elemento = new No(v, null, null);
        if(tamanho == 0) {
            controle.proximo = elemento;
            controle.anterior = elemento;
            elemento.proximo = controle;
            elemento.anterior = controle;

            tamanho++;
            
        } else {
            String placa = v.placa;
            boolean achou = false;
            No el = controle;
    
            while (el.proximo != controle){ 
                if(el.proximo.elemento.placa.equals(placa)) {
                    achou = true;
                    break;
                }
                el = el.proximo;
            }
    
            if(achou)
                throw new Exception("Já existe um veículo cadastrado com essa placa. Contate as autoridades.");
            else {
                elemento.anterior = controle.anterior;
                elemento.proximo = controle;
                controle.anterior.proximo = elemento;
                controle.anterior = elemento;

                tamanho++;
            }

        }
    }

    public void remove(String placa) throws Exception {
        if(tamanho == 0)
            throw new Exception("Não há veículos cadastrados.");
        else {
            boolean achou = false;
            No el = controle;
    
            while (el.proximo != controle){ 
                if(el.proximo.elemento.placa.equals(placa)) {
                    achou = true;

                    el.proximo.proximo.anterior = el;
                    el.proximo = el.proximo.proximo;

                    tamanho--;

                    break;
                }
                el = el.proximo;
            }
            if(!achou)
                throw new Exception("Não há veículo cadastrado com essa placa.");
        }
    }

    public void print() throws Exception {
        if(tamanho == 0)
            throw new Exception("Não há veículos cadastrados.");
        else {
            No el = controle;

            while (el.proximo != controle){ 
                System.out.println("\nPlaca: " + el.proximo.elemento.placa);
                System.out.println("Marca: " + el.proximo.elemento.marca);
                System.out.println("Modelo: " + el.proximo.elemento.modelo);
                System.out.println("Modelo: R$" + el.proximo.elemento.valor);
    
                el = el.proximo;
            }
        }
    }
}
