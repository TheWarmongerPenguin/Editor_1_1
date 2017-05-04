// <editor-fold defaultstate="collapsed" desc="License">
/*
 * I told you that copy was not the way to do it
 */
// </editor-fold>
package editor_1_1;

import javax.swing.JPanel;

/**
 *
 * @author Samuele Pozzebon
 */
public class SlidingAnimation extends Thread implements Runnable{
    
    int moveX;
    int moveRatio;
    JPanel p;
    private volatile boolean stopWork;;
    private boolean done;
    
    public SlidingAnimation(JPanel p, int x, int ratio) {
        moveX = x;
        moveRatio = ratio;
        this.p = p;
    }
    
    @Override
    public void run() {
        while(!stopWork && !done) {
            doUnitOfWork();
        }
        if (p.getX() > moveX) {
            p.setLocation(moveX, p.getY());
        }
    }
    
    public void delete() {
        stopWork = true;
    }
    private void done() {
        done = true;
    }
    private void doUnitOfWork(){
        if (moveX > p.getX()) {
            while (p.getX() < moveX) {
                p.setLocation(p.getX() + moveRatio, p.getY());
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {break;}
            }

            System.out.println("stop Thread");
        }
        
        else {
            while (p.getX() > moveX) {
                p.setLocation(p.getX() - moveRatio, p.getY());
                try {
                    Thread.currentThread().sleep(1);
                } catch (InterruptedException e) {break;}
            }

            System.out.println("stop Thread");
        };
        done();
    };
}
