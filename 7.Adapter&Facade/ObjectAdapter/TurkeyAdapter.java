/*
 * @Author: hourui 
 * @Date: 2023-01-18 00:54:53 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-18 00:54:53 
 * 适配器 适配 Duck接口
 */
package ObjectAdapter;

public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }


    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
    
}
