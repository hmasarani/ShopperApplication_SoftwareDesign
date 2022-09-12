import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Cart extends JFrame {
	public Cart() {
		getContentPane().setLayout(null);
	}

	public static void main(String[] args) {
		Cart myCart = new Cart();
		JTable myList;
		int start = 0;

		List<String> each = new ArrayList<String>();
		List<String[]> values = new ArrayList<String[]>();

		each.add("Items added to Cart");

		while (start < MainMenu.myCart.size()) {
			values.add(new String[] { MainMenu.myCart.get(start) });
			start++;

		}
		TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), each.toArray());
		myList = new JTable(tableModel);
		myCart.setLayout(new BorderLayout());
		myCart.add(new JScrollPane(myList), BorderLayout.CENTER);

		myCart.add(myList.getTableHeader(), BorderLayout.NORTH);

		myCart.setVisible(true);
		myCart.setSize(350, 600);

	}

}