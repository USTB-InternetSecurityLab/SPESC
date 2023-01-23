# SPESC Language —— Smart Legal Contract Language
* specific smart contract on Law 

* domain-specific language on Legal contract (Law-DSL)

## Why SPESC Language?
  Smart contracts are digital protocols that run on the blockchain. In recent years, the development of Smart Legal Contracts, as a kind of Law-DSLs, involves many fields such as computers, finance, and law. 
  
  In 2018, the SPESC language (http://smartlegalcontract.cn), as an **Advanced Smart Contract Language (ASCL)** or **Smart Legal Contract Language (SLCL)**, have been proposed to solve the difficulties of reading, communicating and collaborative development for people in different fields by **University of Science and Technology, Beijing** (http://crypto.ustb.edu.cn). 
  
  We address the problem on a lack of effective conversion methods between the ASCL/SPESC languages and executable smart contract languages. In response to this problem, our laboratory designed a conversion rule from SPESC language to the target programming language (Solidity), and proposed a three-layer smart contract system framework including advanced smart contract layer, smart contract layer and machine code execution layer. 
  
  1)	First of all, the conversion rules give the corresponding relationship between the generation of the target language party subcontract according to the SPESC contract party definition, and the target language subject subcontract generated by the rest of the SPESC; 

2)	Secondly, in addition to the program framework and storage structure, the target language program also includes Mechanisms such as party personnel management, program timing control, and anomaly detection can assist programmers to write smart contract programs semi-automatically; 

3)	Furthermore, the legibility and conversion correctness of the above-mentioned advanced smart contract framework are verified through two experiments. 

In our experiment, computer and non-computer personnel were invited to read Solidity and SPESC smart contracts in groups and answer questionnaires. The results showed that reading SPESC was about twice as fast as reading Solidity, and the accuracy rate was also higher. 

Then, taking the bidding contract as an example, it gives the conversion from SPESC contract to executable Solidity contract language program according to the above conversion rules, and verifies the correctness of the conversion process through the deployment and operation of the Ethereum private chain. Our examples show that the above transformation rules and system framework can simplify the writing of smart contracts, standardize the program structure of smart contracts, and assist programmers to verify the correctness of codes. 

  
## Start for SPESC-to-Solidity
* The environment is best to use windows, java 8, because you need to use Eclipse and there may be problems under the Mac version.
* Eclipse IDE for Java and DSL Developers is recommended.
* Install the Xtext plug-in (you can learn online information about the installation and introduction of the plug-in, such as https://zhuanlan.zhihu.com/p/33047136)
* You can run this project by opening it with Eclipse.
* It is recommended to learn the official relevant information of xtext before getting started (https://www.eclipse.org/Xtext/)
* Due to the lack of domestic materials, you can learn the relevant knowledge and grammar of dsl and xtext from multiple channels on the Internet, and then further understand and use SPESC through the published papers of this laboratory.

## Reference
[1] SPESC-Translator: Towards Automatically Smart Legal Contract Conversion for Blockchain-based Auction Services.

[2] TA-SPESC: Toward Asset-Driven Smart Contract Language Supporting Ownership Transaction and Rule-Based Generation on Blockchain
