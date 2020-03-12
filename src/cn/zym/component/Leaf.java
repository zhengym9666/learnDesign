package cn.zym.component;

/**
 * @ClassName Leaf
 * @Description TODO 叶子构件，其下没有其他的分支，是遍历的最小单位
 * @Author zhengym
 * @Date 2020/3/12 15:02
 * @Version 1.0
 */
public class Leaf extends Component {

    public Leaf(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

}
