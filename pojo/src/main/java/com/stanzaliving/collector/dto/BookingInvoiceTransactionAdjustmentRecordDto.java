package com.stanzaliving.collector.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BookingInvoiceTransactionAdjustmentRecordDto extends BookingInvoiceTransactionRecordDto {
    Double adjustmentAmount;
//    @Builder.Default
//    Integer count = 1; //might be useful in some aggregation using finisher
//
//    public static Supplier<BookingInvoiceTransactionAdjustmentRecordDto> supplier = () -> BookingInvoiceTransactionAdjustmentRecordDto.builder()
//            .adjustmentAmount(0d)
//            .payableAmount(0d)
//            .arrearsAmount(0d)
//            .pendingAmount(0d)
//            .bookingUuid(null)
//            .count(0)
//            .build();
//
//    public static Collector<BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto> aggregatedCollector =
//            new Collector<BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto>() {
//                @Override
//                public Supplier<BookingInvoiceTransactionAdjustmentRecordDto> supplier() {
//                    return BookingInvoiceTransactionAdjustmentRecordDto.supplier;
//                }
//
//                @Override
//                public BiConsumer<BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto> accumulator() {
//                    return (o1, o2) -> {
//                        o1.setAdjustmentAmount(o1.getAdjustmentAmount() + o2.getAdjustmentAmount());
//                        o1.setPayableAmount(o1.getPayableAmount() + o2.getPayableAmount());
//                        o1.setArrearsAmount(o1.getArrearsAmount() + o2.getArrearsAmount());
//                        o1.setPendingAmount(o1.getPendingAmount() + o2.getPendingAmount());
////                        o1.setCount(o1.getCount() + o2.getCount());
//                        o1.setCityUuid(o2.getCityUuid());
//                        o1.setMicromarketUuid(o2.getMicromarketUuid());
//                        o1.setResidenceUuid(o2.getResidenceUuid());
//                        o1.setAccessLevel(o2.getAccessLevel());
//                        o1.setAccessLevelName(o2.getAccessLevelName());
//                    };
//                }
//
//                @Override
//                public BinaryOperator<BookingInvoiceTransactionAdjustmentRecordDto> combiner() {
//                    return (o1, o2) -> {
////                        o1.setAdjustmentAmount(o1.getAdjustmentAmount() + o2.getAdjustmentAmount());
////                        return o1;
//                        return null;
//                    };
//                }
//
//                @Override
//                public Function<BookingInvoiceTransactionAdjustmentRecordDto, BookingInvoiceTransactionAdjustmentRecordDto> finisher() {
//                    return a -> a;
//                }
//
//                @Override
//                public Set<Characteristics> characteristics() {
//                    return Collections.emptySet();
//                }
//            };
}
