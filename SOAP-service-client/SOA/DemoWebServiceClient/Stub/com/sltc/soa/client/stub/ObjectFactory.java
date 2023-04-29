
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.soa.client.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddUser_QNAME = new QName("http://soa.sltc.com/", "addUser");
    private final static QName _DepositResponse_QNAME = new QName("http://soa.sltc.com/", "depositResponse");
    private final static QName _UserCheckingResponse_QNAME = new QName("http://soa.sltc.com/", "userCheckingResponse");
    private final static QName _BalanceCheckingResponse_QNAME = new QName("http://soa.sltc.com/", "balanceCheckingResponse");
    private final static QName _Substraction_QNAME = new QName("http://soa.sltc.com/", "substraction");
    private final static QName _BalanceChecking_QNAME = new QName("http://soa.sltc.com/", "balanceChecking");
    private final static QName _Transfer_QNAME = new QName("http://soa.sltc.com/", "transfer");
    private final static QName _SubstractionResponse_QNAME = new QName("http://soa.sltc.com/", "substractionResponse");
    private final static QName _UserChecking_QNAME = new QName("http://soa.sltc.com/", "userChecking");
    private final static QName _Withdraw_QNAME = new QName("http://soa.sltc.com/", "withdraw");
    private final static QName _AddUserResponse_QNAME = new QName("http://soa.sltc.com/", "addUserResponse");
    private final static QName _WithdrawResponse_QNAME = new QName("http://soa.sltc.com/", "withdrawResponse");
    private final static QName _Deposit_QNAME = new QName("http://soa.sltc.com/", "deposit");
    private final static QName _TransferResponse_QNAME = new QName("http://soa.sltc.com/", "transferResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.soa.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link UserCheckingResponse }
     * 
     */
    public UserCheckingResponse createUserCheckingResponse() {
        return new UserCheckingResponse();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link BalanceChecking }
     * 
     */
    public BalanceChecking createBalanceChecking() {
        return new BalanceChecking();
    }

    /**
     * Create an instance of {@link Substraction }
     * 
     */
    public Substraction createSubstraction() {
        return new Substraction();
    }

    /**
     * Create an instance of {@link BalanceCheckingResponse }
     * 
     */
    public BalanceCheckingResponse createBalanceCheckingResponse() {
        return new BalanceCheckingResponse();
    }

    /**
     * Create an instance of {@link UserChecking }
     * 
     */
    public UserChecking createUserChecking() {
        return new UserChecking();
    }

    /**
     * Create an instance of {@link SubstractionResponse }
     * 
     */
    public SubstractionResponse createSubstractionResponse() {
        return new SubstractionResponse();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link WithdrawResponse }
     * 
     */
    public WithdrawResponse createWithdrawResponse() {
        return new WithdrawResponse();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserCheckingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "userCheckingResponse")
    public JAXBElement<UserCheckingResponse> createUserCheckingResponse(UserCheckingResponse value) {
        return new JAXBElement<UserCheckingResponse>(_UserCheckingResponse_QNAME, UserCheckingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceCheckingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "balanceCheckingResponse")
    public JAXBElement<BalanceCheckingResponse> createBalanceCheckingResponse(BalanceCheckingResponse value) {
        return new JAXBElement<BalanceCheckingResponse>(_BalanceCheckingResponse_QNAME, BalanceCheckingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Substraction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substraction")
    public JAXBElement<Substraction> createSubstraction(Substraction value) {
        return new JAXBElement<Substraction>(_Substraction_QNAME, Substraction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceChecking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "balanceChecking")
    public JAXBElement<BalanceChecking> createBalanceChecking(BalanceChecking value) {
        return new JAXBElement<BalanceChecking>(_BalanceChecking_QNAME, BalanceChecking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transfer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "transfer")
    public JAXBElement<Transfer> createTransfer(Transfer value) {
        return new JAXBElement<Transfer>(_Transfer_QNAME, Transfer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstractionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "substractionResponse")
    public JAXBElement<SubstractionResponse> createSubstractionResponse(SubstractionResponse value) {
        return new JAXBElement<SubstractionResponse>(_SubstractionResponse_QNAME, SubstractionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserChecking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "userChecking")
    public JAXBElement<UserChecking> createUserChecking(UserChecking value) {
        return new JAXBElement<UserChecking>(_UserChecking_QNAME, UserChecking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "withdrawResponse")
    public JAXBElement<WithdrawResponse> createWithdrawResponse(WithdrawResponse value) {
        return new JAXBElement<WithdrawResponse>(_WithdrawResponse_QNAME, WithdrawResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "transferResponse")
    public JAXBElement<TransferResponse> createTransferResponse(TransferResponse value) {
        return new JAXBElement<TransferResponse>(_TransferResponse_QNAME, TransferResponse.class, null, value);
    }

}
