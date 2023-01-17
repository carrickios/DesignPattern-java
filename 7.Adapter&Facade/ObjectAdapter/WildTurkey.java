/*
 * @Author: hourui 
 * @Date: 2023-01-18 00:52:54 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-18 00:52:54 
 */
package ObjectAdapter;

public class WildTurkey implements Turkey {

    @Override
    public void fly() {
        System.out.println("WildTurkey fly");
    }

    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble");
    }
    
}
