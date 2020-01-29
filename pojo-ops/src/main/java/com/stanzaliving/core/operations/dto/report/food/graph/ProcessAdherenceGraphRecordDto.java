package com.stanzaliving.core.operations.dto.report.food.graph;

import com.stanzaliving.core.operations.dto.report.GraphRecordDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ProcessAdherenceGraphRecordDto extends GraphRecordDto {

    Integer totalCount = 0;
    Integer menuAdherence = 0;
    Integer quantityAdherence = 0;
    Integer onTimeDelivery = 0;
    Integer orderedOnTime = 0;
    Integer menuCreated = 0;


    public static BiConsumer<ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto> aggregatedRow = (o1, o2) -> {
        o1.setTotalCount(o1.getTotalCount() + o2.getTotalCount());
        o1.setMenuAdherence(o1.getMenuAdherence() + o2.getMenuAdherence());
    };

    public static Supplier<ProcessAdherenceGraphRecordDto> supplier = () -> ProcessAdherenceGraphRecordDto.builder().menuAdherence(0).totalCount(0).build();


    public static Collector<ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto> aggregatedCollector =
            new Collector<ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto>() {
                @Override
                public Supplier<ProcessAdherenceGraphRecordDto> supplier() {
                    return ProcessAdherenceGraphRecordDto.supplier;
                }

                @Override
                public BiConsumer<ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto> accumulator() {
                    return (o1, o2) -> {
                        o1.setTotalCount(o1.getTotalCount() + o2.getTotalCount());
                        o1.setMenuAdherence(o1.getMenuAdherence() + o2.getMenuAdherence());
                    };
                }

                @Override
                public BinaryOperator<ProcessAdherenceGraphRecordDto> combiner() {
                    return (o1, o2) -> {
                        o1.setTotalCount(o1.getTotalCount() + o2.getTotalCount());
                        o1.setMenuAdherence(o1.getMenuAdherence() + o2.getMenuAdherence());
                        return o1;
                    };
                }

                @Override
                public Function<ProcessAdherenceGraphRecordDto, ProcessAdherenceGraphRecordDto> finisher() {
                    return a -> a;
                }

                @Override
                public Set<Characteristics> characteristics() {
                    return Collections.emptySet();
                }
            };
}