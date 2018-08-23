package lsh.agenda3.mymodule;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class MyGridPane extends GridPane{

	/**
	 * 添加子结点
	 * @param child
	 * @param columnX
	 * @param rowY
	 * @return
	 */
	public MyGridPane addMNode(Node child,int columnX, int rowY) {
		add(child,columnX,rowY);
		return this;
	}
	
	/**
	 * 设置最小大小
	 */
	public MyGridPane setMMinSize(double x,double y) {
		setMinSize(x,y);
		return this;
	}
	
	/**
	 * 设置垂直、水平间距
	 * @param vGap
	 * @param hGap
	 * @return
	 */
	public MyGridPane setMGap(double vGap,double hGap) {
		setVgap(vGap);
		setHgap(hGap);
		return this;
	}
	
	/**
	 * 设置内间距
	 * @param top
	 * @param right
	 * @param bottom
	 * @param left
	 * @return
	 */
	public MyGridPane setMPadding(double top,double right,double bottom, double left) {
		setPadding(new Insets(top,right,bottom,left));
		return this;
	}
	
	/**
	 * 设置样式
	 * @param style
	 * @return
	 */
	public MyGridPane setMStyle(String style) {
		setStyle(style);
		return this;
	}
	
	public MyGridPane setMAlignment() {
		this.setAlignment(Pos.CENTER);
		return this;
	}
}
