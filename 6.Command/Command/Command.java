package Command;
/*
 * @Author: hourui 
 * @Date: 2023-01-17 02:18:13 
 * @Last Modified by:   hourui 
 * @Last Modified time: 2023-01-17 02:18:13 
 */

 
public interface Command {
    void execute();
    void undo();
}