import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {

// СОЗДАЕМ ФРЕЙМ
        JFrame frame = new JFrame("JAVA SpreadSheet");
        frame.setSize(400, 400);
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setLocationRelativeTo(null);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// СОЗДАЕМ ТАБЛИЦУ, задаем размер (55х5) и КРЕПИМ ЕЁ к ФРЕЙМУ
        JTable table = new JTable(55, 5);
        table.setGridColor(Color.cyan);
        table.setAutoCreateRowSorter(true);                     // разрешает сортировку в столбце в JTable
        table.getTableHeader().setReorderingAllowed(false);     // запрещает изменять порядок столбцов в JTable
        table.setEnabled(false);                                // запрещает редактировать таблицу JTable
        frame.add(table);

// СОЗДАЕМ ПАНЕЛЬ ПРОКРУТКИ и КРЕПИМ ЕЁ к ФРЕЙМУ
        JScrollPane scroll = new JScrollPane(table);
        frame.getContentPane().add(scroll, BorderLayout.CENTER);

// ЗАПОЛНЯЕМ ТАБЛИЦУ, ВНОСЯ ИЗМЕНЕНИЯ В ПРЕДВАРИТЕЛЬНО СОЗДАННУЮ
        table.setValueAt(null, 0, 0);
        table.setValueAt("ID01", 1, 0);
        table.setValueAt("ID02", 2, 0);
        table.setValueAt("ID03", 3, 0);
        table.setValueAt("ID04", 4, 0);
        table.setValueAt("TITLE", 0, 1);
        table.setValueAt("AMOUNT", 0, 2);
        table.setValueAt("PRICE", 0, 3);
        table.setValueAt("TOTAL", 0, 4);

// ДЕЛАЕМ ФРЕЙМ С ТАБЛИЦЕЙ ВИДИМЫМИ
        frame.pack();
        frame.setVisible(true);
    }
}
/**
 * Other examples:
 * http://www.java2s.com/Code/JavaAPI/javax.swing.table/DefaultTableModeladdColumnObjectcolumnName.htm
 * http://www.java2s.com/Tutorial/Java/0240__Swing/1000__JTable.htm
 * http://www.java2s.com/Tutorial/Java/0240__Swing/Insertanewcolumntoatable.htm
 * https://docs.oracle.com/javase/7/docs/api/javax/swing/table/DefaultTableModel.html
 * http://study-and-dev.com/blog/java_swing_4/
 * http://www.javapractices.com/topic/TopicAction.do?Id=168
 * http://habrahabr.ru/post/137347/
 * http://www.programcreek.com/java-api-examples/javax.swing.table.TableCellRenderer
 * http://www.coderanch.com/t/501380/GUI/java/Understanding-JTable-addColumn
 */