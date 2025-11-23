package com.crm.convert;

import com.crm.entity.Contract;
import com.crm.entity.ContractProduct;
import com.crm.vo.ContractVO;
import com.crm.vo.ProductVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-23T10:38:28+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.16 (Eclipse Adoptium)"
)
public class ContractConvertImpl implements ContractConvert {

    @Override
    public Contract toContract(ContractVO contractVO) {
        if ( contractVO == null ) {
            return null;
        }

        Contract contract = new Contract();

        contract.setId( contractVO.getId() );
        contract.setNumber( contractVO.getNumber() );
        contract.setName( contractVO.getName() );
        contract.setAmount( contractVO.getAmount() );
        contract.setReceivedAmount( contractVO.getReceivedAmount() );
        contract.setSignTime( contractVO.getSignTime() );
        contract.setCustomerId( contractVO.getCustomerId() );
        contract.setOpportunityId( contractVO.getOpportunityId() );
        contract.setStatus( contractVO.getStatus() );
        contract.setRemark( contractVO.getRemark() );
        contract.setCreateTime( contractVO.getCreateTime() );
        contract.setUpdateTime( contractVO.getUpdateTime() );
        contract.setCreaterId( contractVO.getCreaterId() );
        contract.setOwnerId( contractVO.getOwnerId() );
        contract.setStartTime( contractVO.getStartTime() );
        contract.setEndTime( contractVO.getEndTime() );

        return contract;
    }

    @Override
    public ProductVO toProductVO(ContractProduct product) {
        if ( product == null ) {
            return null;
        }

        ProductVO productVO = new ProductVO();

        productVO.setId( product.getId() );
        productVO.setPId( product.getPId() );
        productVO.setPName( product.getPName() );
        productVO.setTotalPrice( product.getTotalPrice() );
        productVO.setCount( product.getCount() );
        productVO.setPrice( product.getPrice() );

        return productVO;
    }

    @Override
    public List<ProductVO> toProductVOList(List<ContractProduct> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductVO> list = new ArrayList<ProductVO>( productList.size() );
        for ( ContractProduct contractProduct : productList ) {
            list.add( toProductVO( contractProduct ) );
        }

        return list;
    }
}
