/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefa
 */
public class decrementa implements Runnable
{
    private int d;
    private boolean g=true;
    public decrementa(int c)
    {
        this.d=d;
    }
    
    @Override
    public void run()
    {
        if(this.d==100)
        {
            
            while(g=true)
                
            {
                for(this.d=100;this.d>=0;this.d--)
                    
                {
                    System.out.println(this.d);
                }
            }
        }
    }
}
