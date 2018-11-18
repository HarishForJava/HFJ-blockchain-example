# Java BlockChain Example

A blockchain is just a chain/list of blocks. Each block in the blockchain will have its own digital signature, contain digital signature of the previous block, and have some data.

#Formula of Block Chain.

                         Block = data + previous hash;
                         
         blockchain data structure can be viewed as a linked list. Each block within the blockchain references a previous block, known as the parent block in the block header. The sequence of linking each block to its parent creates a chain going back all the way to the first block ever created, known as the genesis block. In fact, this parent block linking is what makes the blockchain immutable.
         
#Hash = Digital Signature.

Each block doesn’t just contain the hash of the block before it, but its own hash is in part, calculated from the previous hash. If the previous block’s data is changed then the previous block’s hash will change ( since it is calculated in part, by the data) in turn affecting all the hashes of the blocks there after. Calculating and comparing the hashes allow us to see if a blockchain is invalid.