package com.platon.privacy.contracts;

import com.alaya.abi.wasm.WasmFunctionEncoder;
import com.alaya.abi.wasm.datatypes.WasmFunction;
import com.alaya.crypto.Credentials;
import com.alaya.protocol.Web3j;
import com.alaya.protocol.core.RemoteCall;
import com.alaya.protocol.core.methods.response.TransactionReceipt;
import com.alaya.rlp.wasm.datatypes.Uint64;
import com.alaya.rlp.wasm.datatypes.WasmAddress;
import com.alaya.tx.TransactionManager;
import com.alaya.tx.WasmContract;
import com.alaya.tx.gas.GasProvider;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the com.alaya.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version none.
 */
public class Simple_contract extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001530f60017f017f60027f7f0060017f0060000060027f7f017f60037f7f7f0060047f7f7f7f0060017f017e60027f7e0060037e7e7f006000017f60037f7f7f017f60047f7f7f7f017f60017e017f60027e7e017f02a9020d03656e760c706c61746f6e5f70616e6963000303656e760d726c705f6c6973745f73697a65000003656e760f706c61746f6e5f726c705f6c697374000503656e760e726c705f62797465735f73697a65000403656e7610706c61746f6e5f726c705f6279746573000503656e760d726c705f753132385f73697a65000e03656e760f706c61746f6e5f726c705f75313238000903656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000a03656e7610706c61746f6e5f6765745f696e707574000203656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000c03656e7610706c61746f6e5f7365745f7374617465000603656e760d706c61746f6e5f72657475726e000103232203030005070702000200000d010801000403010100010100010201020b00000304060405017001010105030100020608017f0141c088040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f7273000d0f5f5f66756e63735f6f6e5f65786974001e06696e766f6b65000e0ac533220400102c0bff0502057f027e23004190026b22002400102c10072201100f22021008200042ffffffff0f370308200020013602042000200236020020004200370310200041c8006a20004100101002400240200041c8006a10112205500d004180081012200551044020001013200041c8006a101410150c020b4185081012200551044020001016410247044010000b200041c8006a200041011010200041c8006a10112105200041c8006a101422012005370310200110150c020b4189081012200551044020001013200041c8006a101422022903102105200041c8016a1017220120051018101920012005101a200128020c200141106a28020047044010000b20012802002001280204100c200128020c22030440200120033602100b200210150c020b418d0810122005510440200041d8016a22024100360200200041d0016a22034200370300200042003703c80120001016410247044010000b200041c8006a200041011010200041c8006a200041c8016a101b200041c8006a10142101200041286a20022802002202360200200041206a20032903002205370300200020002903c8012206370318200141386a2006370300200141406b2005370300200141c8006a2002360200200110150c020b41990810122005520d0020001013200041a8016a2201200041c8006a1014220241c8006a280000360200200041a0016a2203200241406b2900003703002000200241386a29000037039801200041c8016a1017220420004198016a101c1019200041c0016a20012802002201360200200041b8016a20032903002205370300200020002903980122063703b001200041e8016a2005370300200041f0016a2001360200200041206a2005370300200041286a2001360200200020063703e0012000200637031820004188026a200136020020004180026a2005370300200020063703f8012004200041f8016a101d220128020c200141106a28020047044010000b20012802002001280204100c200128020c22030440200120033602100b200210150c010b10000b101e20004190026a24000b9b0101047f230041106b220124002001200036020c2000047f41bc08200041086a2202411076220041bc082802006a220336020041b80841b808280200220420026a41076a417871220236020002400240200341107420024d044041bc08200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20042001410c6a4104102941086a0541000b2100200141106a240020000bcf0202077f017e230041106b220324002001280208220420024b0440200341086a200110232001200341086a102436020c200341086a20011023410021042001027f410020032802082207450d001a4100200328020c2208200128020c2206490d001a200820062006417f461b210520070b360210200141146a2005360200200141003602080b200141106a210903400240200420024f0d002001280214450d00200341086a2001102341002104027f410020032802082207450d001a4100200328020c2208200128020c2206490d001a200820066b2104200620076a0b21052001200436021420012005360210200341086a2009410020091024102e20012003290308220a3702102001200128020c200a422088a76a36020c2001200128020841016a22043602080c010b0b20004200370210200042ffffffff0f37020820002009290200370200200341106a24000b5402027f017e230041106b22012400200141086a2000101f200128020c2100200128020821020340200004402000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a240020030b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b0e0020001016410147044010000b0bca0401087f230041406a22012400200042d1f0fad48ae09ad34537030820004200370300200141286a101722022000290308101a200228020c200241106a28020047044010000b02402002280200220720022802042206100922054504400c010b2001410036022020014200370318200141186a200510202007200620012802182204200128021c220820046b100a417f47044020014200370310200142ffffffff0f3703082001200441016a360200200120082004417f736a360204200020011011370310200521030b2004450d002001200436021c0b200228020c22040440200220043602100b2003450440200020002903003703100b2000420037001841002104200041286a4100360000200041206a4200370000200041386a22054200370000200041306a220342dda4afedfcbbf09c977f370300200041406b4200370000200041c8006a4100360000200141286a101722022003290300101a200228020c200241106a28020047044010000b0240200228020022062002280204220810092207450d002001410036022020014200370318200141186a200710202006200820012802182203200128021c220620036b100a417f47044020014200370310200142ffffffff0f3703082001200341016a360200200120062003417f736a36020420012005101b200721040b2003450d002001200336021c0b200228020c22030440200220033602100b20044504402005200041186a2202290300370300200541106a200241106a280200360200200541086a200241086a2903003703000b200141406b240020000b9e0502087f027e230041a0016b2203240020034188016a10172202200041306a22012903001018101920022001290300101a200041386a2101200228020c200241106a28020047044010000b2002280204210720022802002108200341f0006a101721052001101c21062005200341186a1021220410222005200620042802046a20042802006b1019200341106a200141106a2800002206360200200341086a200141086a290000220937030020032001290000220a370300200341306a2009370300200341386a2006360200200341c8006a2009370300200341d0006a20063602002003200a3703282003200a370340200341e8006a2006360200200341e0006a20093703002003200a37035802402005200341d8006a101d220128020c200141106a280200460440200141046a2105200128020021060c010b200141046a2105100020012802002106200128020c2001280210460d0010000b2008200720062005280200100b200428020022050440200420053602040b200128020c22040440200120043602100b200228020c22010440200220013602100b20034188016a1017220120002903081018101920012000290308101a200128020c200141106a28020047044010000b2001280204210520012802002106200341f0006a101721022000290310101821072002200341d8006a1021220410222002200720042802046a20042802006b101920022000290310101a0240200228020c200241106a280200460440200241046a2107200228020021080c010b200241046a2107100020022802002108200228020c2002280210460d0010000b2006200520082007280200100b200428020022050440200420053602040b200228020c22040440200220043602100b200128020c22020440200120023602100b200341a0016a24000b860101057f230041106b2201240002402000280204450d0020002802002d000041c001490d00200141086a20001023200128020c210003402000450d01200141002000200141086a102422036b200128020822044520002003497222051b220036020c20014100200320046a20051b360208200241016a21020c000b000b200141106a240020020b29002000410036020820004200370200200041001025200041146a41003602002000420037020c20000bb00102037f017e230041206b22012400200141186a4100360200200141106a4200370300200141086a4200370300200142003703004101210320004280015a0440034020002004845045044020044238862000420888842100200241016a2102200442088821040c010b0b024020024138490d002002210303402003450d01200241016a2102200341087621030c000b000b200241016a21030b2001200336020020014104721026200141206a240020030b1300200028020820014904402000200110250b0b2801017f2000420020011005200028020422026a102742002001200220002802006a1006200010280b810101037f230041206b22022400200241186a2000101f200241086a22004200370300200241106a22044100360200200242003703002002200228021c2203411420034114491b22036b41146a2002280218200310291a200141106a2004280200360000200141086a200029030037000020012002290300370000200241206a24000b850202037f027e23004180016b22012400200141306a4100360200200141286a4200370300200141206a4200370300200141086a200041086a2900002204370300200141106a200041106a280000220236020020014200370318200120002900002205370300200141406b2004370300200141c8006a2002360200200141d8006a2004370300200141e0006a20023602002001200537033820012005370350200141f8006a2002360200200141f0006a200437030020012005370368410121020240034020034114460d01200141e8006a20036a2100200341016a210320002d0000450d000b411521020b20012002360218200141186a410472102620014180016a240020020b2a01017f2000200141141003200028020422026a102720014114200220002802006a10042000102820000b880101037f41a808410136020041ac082802002100034020000440034041b00841b0082802002201417f6a2202360200200141014845044041a8084100360200200020024102746a22004184016a280200200041046a28020011020041a808410136020041ac0828020021000c010b0b41b008412036020041ac08200028020022003602000c010b0b0bb10101057f2001102a21032000027f0240200128020422044504400c010b200128020022062c00002201417f4c0440027f200141ff0171220241bf014d04404100200141ff017141b801490d011a200241c97e6a0c010b4100200141ff017141f801490d001a200241897e6a0b41016a21020b200220036a20044b0d0020042002490d00410020042003490d011a200220066a2105200420026b20032003417f461b0c010b41000b360204200020053602000bfd0101067f024020002802042202200028020022046b220520014904402000280208220720026b200120056b22034f04400340200241003a00002000200028020441016a22023602042003417f6a22030d000c030b000b2001200720046b2202410174220420042001491b41ffffffff07200241ffffffff03491b220104402001102b21060b200520066a220521020340200241003a0000200241016a21022003417f6a22030d000b200120066a210420052000280204200028020022066b22016b2103200141014e044020032006200110291a0b2000200436020820002002360204200020033602000f0b200520014d0d002000200120046a3602040b0b3a01017f200041003602082000420037020020004101102b2201360200200141fe013a00002000200141016a22013602082000200136020420000b6101037f200028020c200041106a28020047044010000b200028020422022001280204200128020022036b22016a220420002802084b047f20002004102520002802040520020b20002802006a2003200110291a2000200028020420016a3602040b6b01017f2001102a210220002001027f027f41002001280204450d001a410020012802002c0000417f4a0d011a20012802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b2002102e0ba20102027f017e230041206b2201240020014200370318200142ffffffff0f370310200120002902002203370308027f41002003428080808010540d001a41012003a72c00002200417f4a0d001a027f200041ff0171220241bf014d04404100200041ff017141b801490d011a200241c97e6a0c010b4100200041ff017141f801490d001a200241897e6a0b200141086a102a6a41016a0b2100200141206a240020000b2f01017f200028020820014904402001100f200028020020002802041029210220002001360208200020023602000b0b860201067f200028020422032000280210220141087641fcffff07716a2102027f200320002802082204460440200041146a210641000c010b2003200028021420016a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062002280200200141ff07714102746a0b21010340024020012005460440200641003602000340200420036b41027522014103490d022000200341046a22033602040c000b000b200141046a220120022802006b418020470d0120022802042101200241046a21020c010b0b2001417f6a220241014d04402000418004418008200241016b1b3602100b03402003200447044020002004417c6a22043602080c010b0b0b3601017f200028020820014904402001100f200028020020002802041029210220002001360208200020023602000b200020013602040b7a01037f0340024020002802102201200028020c460d00200141786a2802004504401000200028021021010b200141786a22022002280200417f6a220336020020030d002000200236021020002001417c6a2802002201200028020420016b220210016a1027200120002802006a22012002200110020c010b0b0bfc0801067f03400240200020046a2105200120046a210320022004460d002003410371450d00200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220745044003402006411049450440200020046a2203200120046a2205290200370200200341086a200541086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2205200120046a2204290200370200200441086a2103200541086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002007417f6a220741024b0d00024002400240024002400240200741016b0e020102000b2005200120046a220328020022073a0000200541016a200341016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2203200120046a220541046a2802002202410874200741187672360200200341046a200541086a2802002207410874200241187672360200200341086a2005410c6a28020022024108742007411876723602002003410c6a200541106a2802002207410874200241187672360200200441106a2104200641706a21060c000b000b2005200120046a220328020022073a0000200541016a200341016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2203200120046a220541046a2802002202411074200741107672360200200341046a200541086a2802002207411074200241107672360200200341086a2005410c6a28020022024110742007411076723602002003410c6a200541106a2802002207411074200241107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022073a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2203200120046a220541046a2802002202411874200741087672360200200341046a200541086a2802002207411874200241087672360200200341086a2005410c6a28020022024118742007410876723602002003410c6a200541106a2802002207411874200241087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000b7101027f200028020445044041000f0b4101210120002802002c00002202417f4c047f200241ff0171220141b7014d0440200141807f6a0f0b200241ff0171220241bf014d04402000200141c97e6a102d0f0b200241f7014d0440200141c07e6a0f0b2000200141897e6a102d0520010b0b0b002000410120001b100f0b3501017f230041106b220041c0880436020c41b408200028020c41076a417871220036020041b808200036020041bc083f003602000b8d01002001417f6a220141034b044041000f0b0240024002400240200141016b0e03010203000b20002802002d00010f0b200028020022012d000141087420012d0002720f0b200028020022012d000241087420012d00014110747220012d0003720f0b200028020028000122014118742001410874418080fc07717220014108764180fe0371200141187672720b5b01027f2000027f0240200128020022054504400c010b200220036a200128020422014b0d0020012002490d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b0b2b01004180080b24696e69740073657400676574007365745f61646472657373006765745f61646472657373";

    public static String BINARY = BINARY_0;

    public static final String FUNC_SET_ADDRESS = "set_address";

    public static final String FUNC_SET = "set";

    public static final String FUNC_GET = "get";

    public static final String FUNC_GET_ADDRESS = "get_address";

    protected Simple_contract(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    protected Simple_contract(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }

    public RemoteCall<TransactionReceipt> set_address(WasmAddress addr) {
        final WasmFunction function = new WasmFunction(FUNC_SET_ADDRESS, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set_address(WasmAddress addr, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET_ADDRESS, Arrays.asList(addr), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public static RemoteCall<Simple_contract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Simple_contract.class, web3j, credentials, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<Simple_contract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Simple_contract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, chainId);
    }

    public static RemoteCall<Simple_contract> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Simple_contract.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public static RemoteCall<Simple_contract> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue, Long chainId) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Simple_contract.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue, chainId);
    }

    public RemoteCall<TransactionReceipt> set(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_SET, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> set(Uint64 input, BigInteger vonValue) {
        final WasmFunction function = new WasmFunction(FUNC_SET, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function, vonValue);
    }

    public RemoteCall<Uint64> get() {
        final WasmFunction function = new WasmFunction(FUNC_GET, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public RemoteCall<WasmAddress> get_address() {
        final WasmFunction function = new WasmFunction(FUNC_GET_ADDRESS, Arrays.asList(), WasmAddress.class);
        return executeRemoteCall(function, WasmAddress.class);
    }

    public static Simple_contract load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider, Long chainId) {
        return new Simple_contract(contractAddress, web3j, credentials, contractGasProvider, chainId);
    }

    public static Simple_contract load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, Long chainId) {
        return new Simple_contract(contractAddress, web3j, transactionManager, contractGasProvider, chainId);
    }
}