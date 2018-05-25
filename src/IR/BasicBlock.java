package IR;

import java.util.ArrayList;
import java.util.List;

public class BasicBlock{
    private List<Inst> instList;

    public BasicBlock() {
        instList = new ArrayList<>();
    }

    public void append(Inst inst){
        instList.add(inst);
    }
}
