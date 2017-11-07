/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoScouts;

/**
 *
 * @author Felix Perez
 */
public class SystemManager {
    private CheckoutList ListOfItems; //Sack o' stuff
    private double Total;
    private InventoryWrapper inventory;
    private BankWrapper bank;
    private TransactionWrapper log;
    
    public void UpdateDatabase(/*in CheckoutList*/){}
    public void Restock(/*in Barcode, in QtyAdded, out Result*/){}
    public void AddNewItem(/*in ItemInfo*/){}
    public void GetItem(/*in Barcode, out ItemInfo*/){}
    public void CreateTransactionReport(/*out TransactionReport*/){}
    public void AddToTransactionLog(/*in CheckoutList*/){}
    public void CreateInventoryReport(/*out InventoryReport*/){}
    public void GetInventory(/*out InventoryList*/){}
    public void UpdateItemInfo(/*in ItemInfo*/){}
}
