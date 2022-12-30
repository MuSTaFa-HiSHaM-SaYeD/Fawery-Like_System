package com.swAssignment.fawrysystem.controllers.transactions;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.Common;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.BSL.transactions.AddToWalletTransactionBsl;
import com.swAssignment.fawrysystem.models.forms.AddToWalletForm;
import com.swAssignment.fawrysystem.models.transactions.AddToWalletTransaction;
import com.swAssignment.fawrysystem.models.transactions.Transaction;

@RestController
public class AddToWalletTransactionController extends Common{
	private AddToWalletTransactionBsl addToWalletTransactionBsl;
    public AddToWalletTransactionController(UserBsl userbsl,AddToWalletTransactionBsl addToWalletTransactionBsl) {
		super(userbsl);
		this.addToWalletTransactionBsl=addToWalletTransactionBsl;
	}
	@PostMapping(value = "/wallet/addFunds")
	public String addToWallet(@RequestBody AddToWalletForm form) {
		int index=userbsl.signin(form.getUserEmail(), form.getUserPassword());
		if(index!=-1) {
			if(userbsl.getUsers().get(index).getWallet().deposite(form.getAmount())) {
				addToWalletTransactionBsl.addTransaction(new AddToWalletTransaction(form.getUserEmail(),form.getAmount()));
				return "Added funds successfully";
			}
			return "credit card balance is not enough to pay";
		}
		return "Authentication failed try again";
	}
	@GetMapping(value = "/admin/Transactions/addToWalletTransactions/get")
    public ArrayList<AddToWalletTransaction> getAddToWalletTransactions(){
		ArrayList<AddToWalletTransaction> addToWalletTransactions = new ArrayList<>();
		for(Transaction transaction : addToWalletTransactionBsl.getTransactions()) {
			addToWalletTransactions.add((AddToWalletTransaction) transaction);
		}
   	    return addToWalletTransactions;
    }
}
