package com.localhost;

import com.jd.open.api.sdk.DefaultJdClient;
import com.jd.open.api.sdk.JdClient;
import com.jd.open.api.sdk.request.category.CategorySearchRequest;
import com.jd.open.api.sdk.request.etms.LdopWaybillReceiveRequest;
import com.jd.open.api.sdk.response.category.CategorySearchResponse;
import com.jd.open.api.sdk.response.etms.LdopWaybillReceiveResponse;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );

        // Official();

        // 京东物流接单接口
        OnReceive_jos();
    }

    // 京东物流接单接口
    protected static int OnReceive_jos() 
    {
    	int num = 1;
        // String SERVER_URL =
        // "http://jos.jd.com/api/detail.htm?apiName=jingdong.ldop.waybill.receive&id=2122";
        // String SERVER_URL =
        // "https://api.jd.com/routerjson?v=2.0&method=jingdong.ldop.waybill.receive";
        String SERVER_URL = "https://api.jd.com/routerjson";

        String accessToken = "c113c64db7c24a689079d39d4458ed28yzex";
        String appKey = "0B3C7A4AED6451FF32BA2F214552E12A";
        String appSecret = "f8f9dc23b29745d7a7ea40c2a50b6464";

        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);

        LdopWaybillReceiveRequest request = new LdopWaybillReceiveRequest();

        // 销售平台
        request.setSalePlat("0030001");
        // 商家编码
        request.setCustomerCode("027K184334");
        // 订单号
        request.setOrderId("7898675875473");
        // 销售平台订单号
        request.setThrOrderId("7898675");
        // 寄件人姓名
        request.setSenderName("张三");
        // 寄件人地址
        request.setSenderAddress("解放大道1863号");
        // 寄件人电话
        request.setSenderTel("18502775859");
        // 寄件人手机
        request.setSenderMobile("18502775859");
        // 寄件人邮编
        request.setSenderPostcode("430068");
        // 收件人名称
        request.setReceiveName("李四");
        // 收件人地址
        request.setReceiveAddress("解放大道2869号长江勘测技术研究所406");
        // 收件人省
        // request.setProvince( "jingdong" );
        // 收件人市
        // request.setCity( "jingdong" );
        // 收件人县
        // request.setCounty( "jingdong" );
        // 收件人镇
        // request.setTown( "jingdong" );
        // 收件人省编码
        // request.setProvinceId( 123 );
        // 收件人市编码
        // request.setCityId( 123 );
        // 收件人县编码
        // request.setCountyId( 123 );
        // 收件人镇编码
        // request.setTownId( 123 );
        // 站点类型
        // request.setSiteType( 123 );
        // 站点编码
        // request.setSiteId( 123 );
        // 站点名称
        // request.setSiteName( "jingdong" );
        // 收件人电话
        request.setReceiveTel("13476068027");
        // 收件人手机号
        request.setReceiveMobile("13476068027");
        // 收件人邮编
        // request.setPostcode( "430000" );
        // 包裹数(大于0，小于1000)
        request.setPackageCount(1);
        // 重量(单位：kg，保留小数点后两位)
        request.setWeight(1.23);
        // 包裹长(单位：cm,保留小数点后两位)
        // request.setVloumLong( 123 );
        // 包裹宽(单位：cm，保留小数点后两位)
        // request.setVloumWidth( 123 );
        // 包裹高(单位：cm，保留小数点后两位)
        // request.setVloumHeight( 123 );
        // 体积(单位：cm3，保留小数点后两位)
        request.setVloumn(1.23);
        // 商品描述
        /*
         * request.setDescription( "jingdong" ); //是否代收货款(是：1，否：0。不填或者超出范围，默认是0)
         * request.setCollectionValue( 123 ); //代收货款金额(保留小数点后两位)
         * request.setCollectionMoney( 123 ); //是否保价(是：1，否：0。不填或者超出范围，默认是0)
         * request.setGuaranteeValue( 123 ); //保价金额(保留小数点后两位)
         * request.setGuaranteeValueAmount( 123 );
         * //签单返还(签单返还类型：0-不返单，1-普通返单，2-校验身份返单，3-电子签返单，4-电子返单+普通返单)
         * request.setSignReturn( 123 );
         * //时效(普通：1，工作日：2，非工作日：3，晚间：4。O2O一小时达：5。O2O定时达：6。不填或者超出范围，默认是1)
         * request.setAging( 123 ); //运输类型(陆运：1，航空：2。不填或者超出范围，默认是1)
         * request.setTransType( 123 ); //运单备注（不超过20个字）,打印面单时备注内容也会显示在快递面单上
         * request.setRemark( "jingdong" ); //配送业务类型（
         * 1:普通，3:填仓，4:特配，6:控温，7:冷藏，8:冷冻，9:深冷）默认是1 request.setGoodsType( 123 );
         * //运单类型。(普通外单：0，O2O外单：1)默认为0 request.setOrderType( 123 );
         * //门店编码(只O2O运单需要传，普通运单不需要传) request.setShopCode( "jingdong" );
         * //预约配送时间（格式：yyyy-MM-dd HH:mm:ss。例如：2014-09-18 08:30:00）
         * request.setOrderSendTime( "jingdong" ); //发货仓编码 request.setWarehouseCode(
         * "jingdong" ); //接货省ID request.setAreaProvId( 123 ); //接货市ID
         * request.setAreaCityId( 123 ); //配送起始时间 request.setShipmentStartTime(
         * "2012-12-12 12:12:12" ); //配送结束时间 request.setShipmentEndTime(
         * "2012-12-12 12:12:12" ); //身份证号 request.setIdNumber( "jingdong" ); //扩展服务
         * request.setAddedService( "jingdong" ); //扩展字段1 request.setExtendField1(
         * "jingdong" ); //扩展字段2 request.setExtendField2( "jingdong" ); //扩展字段3
         * request.setExtendField3( "jingdong" ); //扩展字段4 request.setExtendField4( 123
         * ); //扩展字段5 request.setExtendField5( 123 ); //寄件人公司 request.setSenderCompany(
         * "jingdong" ); //收件人公司 request.setReceiveCompany( "jingdong" );
         * //托寄物名称（为避免托运物品在铁路、航空安检中被扣押，请务必下传商品类目或名称，例如：服装、3C等） request.setGoods(
         * "jingdong" ); //寄托物数量 request.setGoodsCount( 123 ); //产品类型（5：同城即日）
         * request.setPromiseTimeType( 123 ); //运费 request.setFreight( 123 ); //预约取件开始时间
         * request.setPickUpStartTime( "2012-12-12 12:12:12" ); //预约取件结束时间
         * request.setPickUpEndTime( "2012-12-12 12:12:12" );
         */

        try 
        {
        	LdopWaybillReceiveResponse response = client.execute(request);
        	num = 0;
        } catch (Exception e) {
            System.out.println("Receive, catch exception");
        } finally {
            System.out.println("Receive,finally");
        }

        return 1;
    }

    protected static int Official() {
        /*int num = 0;
        String SERVER_URL = "http://gw.api.360buy.com/routerjson";
        String accessToken = "c113c64db7c24a689079d39d4458ed28yzex";
        String appKey = "0B3C7A4AED6451FF32BA2F214552E12A";
        String appSecret = "f8f9dc23b29745d7a7ea40c2a50b6464";

        JdClient client = new DefaultJdClient(SERVER_URL, accessToken, appKey, appSecret);

        CategorySearchRequest request = new CategorySearchRequest();
        request.setFields("id,fid,status,lev,name,index_id");

        try {
        	LdopWaybillReceiveResponse response = client.execute(request);
        } catch (Exception e) {
            System.out.println("testEx, catch exception");
        } finally {
            System.out.println("測試結束");
        }

        num = 1;*/

        return 1;
    }

}

