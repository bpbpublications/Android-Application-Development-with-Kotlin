//
//  ViewController.swift
//  KMPiOS
//
//  Created by Hardik Trivedi on 23/02/2020.
//  Copyright © 2020 Hardik Trivedi. All rights reserved.
//

import UIKit
import SharedCode

class ViewController: UIViewController {
    
    @IBOutlet weak var fromCurrencyTextField: UITextField!
    @IBOutlet weak var toCurrencyLabel: UILabel!
    @IBOutlet weak var conversionFeeLabel: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        fromCurrencyTextField.addTarget(self, action: #selector(ViewController.textFieldDidChange(_:)), for: UIControl.Event.editingChanged)
    }
    
    @objc func textFieldDidChange(_ textField: UITextField) {
        let fromAmount = Float(textField.text!)
        toCurrencyLabel.text = String(format:"%.4f", CommonKt.convertToGBP(fromAmount: fromAmount!)) + " GBP"
        
        let conversionFee="Conversion rate 1 GBP = "+String(format:"%.4f",CommonKt.conversionRate)+"\nConversion fee for "+ActualKt.getPlatformName()+" is "+String(ActualKt.getServiceFee())
    
        conversionFeeLabel.text = conversionFee
    }
}

