package cn.zym.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zhengym
 * @Description //TODO 树枝构件，用来组合树枝节点和叶子节点形成树形结构
 * @Date 2020/3/12 15:04
 * @Param
 * @return
 **/
public class Branch extends Component{
    private List<Component> subordinateChild = new ArrayList<>();

    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    public void addChild(Component _component) {
        this.subordinateChild.add(_component);
    }

    public List<Component> getChildren() {
        return this.subordinateChild;
    }

    public void remove(Component _component) {
        this.subordinateChild.remove(_component);
    }
}
