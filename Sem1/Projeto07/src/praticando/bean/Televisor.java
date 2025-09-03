package praticando.bean;

public class Televisor {
    private int volume;
    private int canal;

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            try {
                if (volume>=0 && volume<=200){
                    this.volume = volume;
                }else{
                    throw new Exception("Valor fora da faixa permitida. (min=0 ate max=20)");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        try {
            if (canal==2 || canal==4 || canal==5 || canal==7 || canal==13){
                this.canal = canal;
            }else{
                throw new Exception("Este canal esta fora do ar ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

        public void aumentarVolume(){
            if (volume<20){
                volume++;
            }

        }
        public void diminuirVolume(){
            if (volume>0){
                volume--;
            }
        }
}
