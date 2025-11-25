package praticando.bean;

public class Arcondicionado {
    private int temperatura;
    private String modo;

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        try {
            String tipos ="Ventilar" + "Aquecer" + "Resfriar";
            if (tipos.equalsIgnoreCase("Ventilar" + "Aquecer" + "Resfriar")){
                this.modo = modo;
            }else{
                throw new Exception("invalido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura){
        try {
            if (temperatura>15 && temperatura<25){
                this.temperatura = temperatura;
            }else{
                throw new Exception("invalido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void aumentarTemperatura(){
        if (temperatura>15){
            temperatura++;
        }
    }

    public void diminuirTemperatura(){
        if (temperatura<25){
            temperatura--;
        }
    }
}
