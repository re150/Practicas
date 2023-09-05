public class Graphics_Thread  extends  Thread{
    private Espiral_arquimides panel;
    private int pasos;
    private int delay;

    public Graphics_Thread(Espiral_arquimides panel, int maxSteps, int delay) {
        this.panel = panel;
        this.pasos = maxSteps;
        this.delay = delay;
    }

    public void run() {
        for (int step = 0; step < pasos; step++) {
            panel.setCurrentStep(step);
            panel.repaint();
            try {
                Thread.sleep(delay); // Pausa entre pasos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}